package com.trees.bst.version1;

public class RightViewOfBinaryTree {

	private static int val = -1;

	void rightView(Tree root) {
		if (root == null)
			return;
		int height = Height.calculateHeight(root);

		for (int i = 1; i <= height; i++) {
			printRightView(root, i);
			System.out.println(val);
		}
	}

	void printRightView(Tree root, int h) {
		if (root == null)
			return;
		if (h == 1) {
			val = root.val;
		} else {
			printRightView(root.left, h - 1);
			printRightView(root.right, h - 1);
		}
	}
}
