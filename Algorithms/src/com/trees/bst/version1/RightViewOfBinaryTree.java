package com.trees.bst.version1;

public class RightViewOfBinaryTree {

    private static int val = -1;

    void rightView(Node root) {
        if (root == null)
            return;
        int height = Height.calculateHeight(root);

        for (int index = 1; index <= height; index++) {
            printRightView(root, index);
            System.out.println(val);
        }
    }

    void printRightView(Node root, int height) {
        if (root == null)
            return;
        if (height == 1) {
            val = root.value;
        } else {
            printRightView(root.leftChild, height - 1);
            printRightView(root.rightChild, height - 1);
        }
    }
}
