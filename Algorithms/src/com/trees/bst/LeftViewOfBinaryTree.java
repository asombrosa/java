package com.trees.bst;

public class LeftViewOfBinaryTree {

	private static boolean value = true;
	void leftView(Tree root) {
		if (root == null) {
			return;
		}

		int height = Height.calculateHeight(root);

		for (int i = 1; i <= height; i++) {
			value = true;
			printFirstElementOfLevelOrderTraversal(root, i);
			System.out.println();
		}

	}

	void printFirstElementOfLevelOrderTraversal(Tree root, int h) {
		if (root == null)
			return;

		if (h == 1 && value) {
			System.out.print(root.val + " ");
			value = false;
		} else {
			printFirstElementOfLevelOrderTraversal(root.left, h - 1);
			printFirstElementOfLevelOrderTraversal(root.right, h - 1);
		}

	}

}
