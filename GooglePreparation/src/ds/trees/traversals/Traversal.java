package ds.trees.traversals;

import ds.trees.BST;

@FunctionalInterface
public interface Traversal<K extends Comparable<K>> {
    public void traverse(BST<K> bst);
}
