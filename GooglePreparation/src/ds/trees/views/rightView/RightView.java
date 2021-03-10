package ds.trees.views.rightView;

import ds.trees.BST;
import ds.trees.Height;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

public class RightView<K extends Comparable<K>> implements Traversal<K> {
    private K value = null;

    @Override
    public void traverse(BST<K> bst) {
        Node<K> root = bst.getRoot();
        for (int i = 1; i <= Height.height(root); i++) {
            rightView(root, i);
            System.out.print(value + " ");
        }
    }

    private void rightView(Node<K> current, int level) {
        if (current == null) {
            return;
        }
        if (level == 1) {
            value = current.value;
        } else if (level > 1) {
            rightView(current.left, level - 1);
            rightView(current.right, level - 1);
        }
    }
}