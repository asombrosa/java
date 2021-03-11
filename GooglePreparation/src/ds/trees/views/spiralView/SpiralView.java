package ds.trees.views.spiralView;

import ds.trees.BST;
import ds.trees.Height;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

/*
                    18
                  /    \
                 2      25
               /   \   /
              1     5  20
                     \
                      10
                        \
                        15

Spiral view of above tree is : 18 25 2 1 5 20 10 15
 */
public class SpiralView<K extends Comparable<K>> implements Traversal<K> {
    private boolean isLeft = false;

    @Override
    public void traverse(BST<K> bst) {
        Node<K> root = bst.getRoot();

        for (int i = 1; i <= Height.height(root); i++) {
            leftView(root, i);
            isLeft = !isLeft;
        }
    }


    private void leftView(Node<K> current, int level) {
        if (current == null) {
            return;
        }
        if (level == 1) {
            System.out.print(current.value + " ");
        } else if (level > 1) {
            if (!isLeft) {
                leftView(current.left, level - 1);
                leftView(current.right, level - 1);
            } else {
                leftView(current.right, level - 1);
                leftView(current.left, level - 1);
            }
        }
    }
}