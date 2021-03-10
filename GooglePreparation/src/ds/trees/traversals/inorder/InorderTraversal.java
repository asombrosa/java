package ds.trees.traversals.inorder;

import ds.trees.BST;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

public class InorderTraversal<K extends Comparable<K>> implements Traversal<K> {
    @Override
    public void traverse(BST<K> bst) {
        inorder(bst.getRoot());
    }

    private void inorder(Node<K> root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
}
