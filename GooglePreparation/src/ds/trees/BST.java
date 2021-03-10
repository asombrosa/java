package ds.trees;

public class BST<K extends Comparable<K>> {
    Node<K> root;

    public Node<K> getRoot() {
        return root;
    }

    public void insert(K value) {
        root = insert(root, value);
    }

    private Node<K> insert(Node<K> current, K value) {
        if (current == null) {
            return new Node<>(value);
        }
        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = insert(current.left, value);
        } else if (compare > 0) {
            current.right = insert(current.right, value);
        }
        return current;
    }

}
