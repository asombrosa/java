package com.trees.bst.version1;

public class LeftViewOfBinaryTree {

	private static boolean value = true;

	void leftView(Node root) {
		if (root == null) {
			return;
		}
		int height = Height.calculateHeight(root);
		for (int index = 1; index <= height; index++) {
			value = true;
			printFirstElementOfLevelOrderTraversal(root, index);
			System.out.println();
		}
	}

	void printFirstElementOfLevelOrderTraversal(Node root, int height) {
		if (root == null)
			return;
		if (height == 1 && value) {
			System.out.print(root.value + " ");
			value = false;
		} else {
			printFirstElementOfLevelOrderTraversal(root.leftChild, height - 1);
			printFirstElementOfLevelOrderTraversal(root.rightChild, height - 1);
		}
	}
}
