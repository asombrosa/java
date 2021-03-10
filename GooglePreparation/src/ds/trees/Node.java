package ds.trees;

public class Node<K extends Comparable<K>> {
    public K value;
    public Node<K> left;
    public Node<K> right;

    public Node(K value) {
        this.value = value;
    }
}
