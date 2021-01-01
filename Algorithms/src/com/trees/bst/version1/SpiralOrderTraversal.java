package com.trees.bst.version1;

import java.util.Stack;

/*
 * 				 20
 * 			  /	     \
 * 		    10        30
 * 	       /  \       / \
 * 		  5   15     25  35
 * 		 / \  / \    / \   / \
 * 		2	7 13 17 23 27 33 37
 *
 *
 *
 * Output:
 *
 *  20 30 10 5 15 25 35 37 33 27 23 17 13 7 2
 *
 */
public class SpiralOrderTraversal {

    void levelOrderTraversal(Node root, int height, Stack<Integer> stack) {
        if (root == null) {
            return;
        }
        if (height == 1) {
            //System.out.print(root.value + " ");
            stack.add(root.value);
        } else if (height > 1) {
            levelOrderTraversal(root.leftChild, height - 1, stack);
            levelOrderTraversal(root.rightChild, height - 1, stack);
        }
    }

    void levelOrder(Node root) {
        int height = Height.calculateHeight(root);
        Stack<Integer> stack = new Stack<>();
        for (int index = 1; index <= height; index++) {
            levelOrderTraversal(root, index, stack);
            while (!stack.isEmpty() && index % 2 == 0)
                System.out.print(stack.pop() + " ");
            for (int element : stack) {
                System.out.print(element + " ");
            }
            stack.clear();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InsertAndSearchInBST insertAndSearchInBST = new InsertAndSearchInBST();
        SpiralOrderTraversal spiral = new SpiralOrderTraversal();
        Node root;
        root = insertAndSearchInBST.insert(20, null);
        insertAndSearchInBST.insert(10, root);
        insertAndSearchInBST.insert(30, root);
        insertAndSearchInBST.insert(5, root);
        insertAndSearchInBST.insert(15, root);
        insertAndSearchInBST.insert(25, root);
        insertAndSearchInBST.insert(35, root);
        spiral.levelOrder(root);
    }
}