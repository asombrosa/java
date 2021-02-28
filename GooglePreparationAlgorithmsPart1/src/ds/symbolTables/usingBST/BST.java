package ds.symbolTables.usingBST;

public class BST<K extends Comparable<K>, V> {
    private Node root;

    private class Node {
        Node left;
        Node right;
        K key;
        V value;
        int count;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return "[ Key : " + key + ", Value : " + value + " ]";
        }
    }

    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private Node put(Node root, K key, V value) {
        if (root == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(root.key);
        if (cmp < 0) {
            root.left = put(root.left, key, value);
        } else if (cmp > 0) {
            root.right = put(root.right, key, value);
        } else {
            root.value = value;
        }
        root.count = 1 + size(root.left) + size(root.right);
        return root;
    }

    public V get(K key) {
        Node current = root;
        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current = current.right;
            } else {
                return current.value;
            }
        }
        return null;
    }

    public K min() {
        Node current = root;
        K key = null;
        while (current != null) {
            key = current.key;
            current = current.left;
        }
        return key;
    }

    public Node min(Node root) {
        Node current = root;
        Node least = null;
        while (current != null) {
            least = current;
            current = current.left;
        }
        return least;
    }

    public K max() {
        Node current = root;
        K key = null;
        while (current != null) {
            key = current.key;
            current = current.right;
        }
        return key;
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node root, K key) {
        if (root == null) {
            return null;
        }
        int compare = key.compareTo(root.key);
        if (compare < 0) {
            root.left = delete(root.left, key);
        } else if (compare > 0) {
            root.right = delete(root.right, key);
        } else {
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }
            Node temp = root;
            root = min(temp.right);
            root.right = temp.right;
            root.left = temp.left;
        }
        root.count = size(root.left) + size(root.right) + 1;
        return root;
    }

    public K floor(K key) {
        Node result = floor(root, key);
        if (result != null) {
            return result.key;
        }
        return null;
    }

    private Node floor(Node curr, K key) {
        if (curr == null) {
            return null;
        }
        int compare = key.compareTo(curr.key);
        if (compare == 0) {
            return curr;
        }
        if (compare < 0) {
            return floor(curr.left, key);
        }

        Node t = floor(curr.right, key);
        if (t != null) {
            return t;
        } else {
            return curr;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return root.count;
        }
    }

    public int rank(K key) {
        return rank(root, key);
    }

    private int rank(Node curr, K key) {
        if (curr == null) {
            return 0;
        }

        int compare = key.compareTo(curr.key);
        if (compare < 0) {
            return rank(curr.left, key);
        }
        if (compare > 0) {
            return 1 + size(curr.left) + rank(curr.right, key);
        }
        return size(curr.left);
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
