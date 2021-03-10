package ds.trees.traversals.postorder;

import ds.trees.BST;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

public class PostorderTraversal<K extends Comparable<K>> implements Traversal<K> {
    @Override
    public void traverse(BST<K> bst) {
        postorder(bst.getRoot());
    }

    private void postorder(Node<K> root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }
}
