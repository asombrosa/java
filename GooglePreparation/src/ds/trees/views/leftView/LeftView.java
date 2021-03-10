package ds.trees.views.leftView;

import ds.trees.BST;
import ds.trees.Height;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

public class LeftView<K extends Comparable<K>> implements Traversal<K> {
    private boolean isLeft = true;

    @Override
    public void traverse(BST<K> bst) {
        Node<K> root = bst.getRoot();
        for (int i = 1; i <= Height.height(root); i++) {
            leftView(root, i);
            isLeft = true;
        }
    }

    private void leftView(Node<K> current, int level) {
        if (current == null) {
            return;
        }
        if (level == 1 && isLeft) {
            System.out.print(current.value + " ");
            isLeft = false;
        } else if (level > 1) {
            leftView(current.left, level - 1);
            leftView(current.right, level - 1);
        }
    }
}