package com.trees.bst;

public class CheckChildSumPropertyOfTree {

	boolean isChildrenSumProperty = true;
	int sum = 0;

	boolean childSumPropertyCheck(Tree root) {
		if (root == null)
			return isChildrenSumProperty;
		int height = Height.calculateHeight(root);
		isChildrenSumProperty = true;
		for (int i = 1; i <= height; i++) {
			levelOrderTraversal(root, i);
		}
		return isChildrenSumProperty;
	}

	private void levelOrderTraversal(Tree root, int i) {
		if (root == null) {
			return;
		}

		if (i == 1) {
			sum = 0;
			if (root.right != null) {
				sum = sum + root.right.val;
			}
			if (root.left != null) {
				sum = sum + root.left.val;
			}
			if ((root.right != null || root.left != null) && sum != root.val) {
				isChildrenSumProperty = false;
				return;
			}
		} else if (i > 1) {
			levelOrderTraversal(root.left, i - 1);
			levelOrderTraversal(root.right, i - 1);
		}
	}
}
