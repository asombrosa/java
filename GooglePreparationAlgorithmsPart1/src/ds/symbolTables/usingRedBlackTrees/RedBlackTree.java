package ds.symbolTables.usingRedBlackTrees;

public class RedBlackTree<K extends Comparable<K>, V> {
    Node root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        K key;
        V value;
        Node left;
        Node right;
        boolean color;

        Node(K key, V value, boolean color) {
            this.key = key;
            this.value = value;
            this.color = color;
        }

        public String toString() {
            return "[ Key : " + key + ", Value : " + value + ", Color : " + color + " ]";
        }

    }

    private boolean isRed(Node current) {
        if (current == null) {
            return false;
        }
        return current.color == RED;
    }

    private Node rotateLeft(Node current) {
        assert isRed(current.right);
        Node temp = current.right;
        current.right = temp.left;
        temp.left = current;
        temp.color = current.color;
        current.color = RED;
        return temp;
    }

    private Node rotateRight(Node current) {
        assert isRed(current.left);
        Node temp = current.left;
        current.left = temp.right;
        temp.right = current;
        temp.color = current.color;
        current.color = RED;
        return temp;
    }

    private void flipColors(Node current) {
        assert !isRed(current);
        assert isRed(current.left);
        assert isRed(current.right);
        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;
    }

    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private Node put(Node current, K key, V value) {
        if (current == null) {
            return new Node(key, value, RED);
        }
        int cmp = key.compareTo(current.key);
        if (cmp < 0) {
            current.left = put(current.left, key, value);
        } else if (cmp > 0) {
            current.right = put(current.right, key, value);
        } else {
            current.value = value;
        }
        if (isRed(current.right) && !isRed(current.left)) {
            current = rotateLeft(current);
        }
        if (isRed(current.left) && isRed(current.left.left)) {
            current = rotateRight(current);
        }
        if (isRed(current.left) && isRed(current.right)) {
            flipColors(current);
        }
        return current;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root);
        inorder(root.right);
    }
}
