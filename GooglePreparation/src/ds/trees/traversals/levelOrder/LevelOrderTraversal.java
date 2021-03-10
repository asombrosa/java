package ds.trees.traversals.levelOrder;

import ds.trees.BST;
import ds.trees.Height;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

public class LevelOrderTraversal<K extends Comparable<K>> implements Traversal<K> {

    @Override
    public void traverse(BST<K> bst) {
        Node<K> root = bst.getRoot();
        for (int i = 1; i <= Height.height(root); i++) {
            levelOrder(root, i);
        }
    }

    private void levelOrder(Node<K> current, int level) {
        if (current == null) {
            return;
        }
        if (level == 1) {
            System.out.print(current.value + " ");
        } else if (level > 1) {
            levelOrder(current.left, level - 1);
            levelOrder(current.right, level - 1);
        }
    }
}
