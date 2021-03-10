package ds.trees.traversals.preorder;

import ds.trees.BST;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

public class PreorderTraversal<K extends Comparable<K>> implements Traversal<K> {
    @Override
    public void traverse(BST<K> bst) {
        preorder(bst.getRoot());
    }

    private void preorder(Node<K> root) {
        if(root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
