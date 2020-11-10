package com.trees.bst.version1;

public class CheckChildSumPropertyOfTree {

    boolean isChildrenSumProperty = true;
    int sum = 0;

    boolean childSumPropertyCheck(Node root) {
        if (root == null)
            return isChildrenSumProperty;
        int height = Height.calculateHeight(root);
        isChildrenSumProperty = true;
        for (int index = 1; index <= height; index++) {
            levelOrderTraversal(root, index);
        }
        return isChildrenSumProperty;
    }

    private void levelOrderTraversal(Node root, int index) {
        if (root == null) {
            return;
        }

        if (index == 1) {
            sum = 0;
            if (root.rightChild != null) {
                sum = sum + root.rightChild.value;
            }
            if (root.leftChild != null) {
                sum = sum + root.leftChild.value;
            }
            if ((root.rightChild != null || root.leftChild != null) && sum != root.value) {
                isChildrenSumProperty = false;
            }
        } else if (index > 1) {
            levelOrderTraversal(root.leftChild, index - 1);
            levelOrderTraversal(root.rightChild, index - 1);
        }
    }
}
