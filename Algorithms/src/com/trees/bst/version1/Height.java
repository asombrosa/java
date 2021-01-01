package com.trees.bst.version1;

public class Height {

    static int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = calculateHeight(root.leftChild);
        int rightHeight = calculateHeight(root.rightChild);
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }
}
