package ds.trees.views.topView;

import ds.trees.BST;
import ds.trees.traversals.Traversal;

public class Runner {
        public static void main(String[] args) {
            BST<Integer> bst = new BST<>();
            bst.insert(18);
            bst.insert(2);
            bst.insert(25);
            bst.insert(1);
            bst.insert(5);
            bst.insert(20);
            bst.insert(10);
            bst.insert(15);
            Traversal traversal = new TopView<>();
            traversal.traverse(bst);

        }
}