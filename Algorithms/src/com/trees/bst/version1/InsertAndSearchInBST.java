package com.trees.bst.version1;

public class InsertAndSearchInBST {
	Tree insert(int v, Tree root) {
		if (root == null) {
			return new Tree(v);
		}
		if (v < root.val) {
			root.left = insert(v, root.left);
		}
		if (v > root.val) {
			root.right = insert(v, root.right);
		}
		return root;
	}

	int search(int searchValue, Tree root) {
		if (root == null) {
			System.out.print("Element Not Found");
			return -1;
		}
		if (searchValue < root.val)
			search(searchValue, root.left);
		else if (searchValue > root.val)
			search(searchValue, root.right);
		else if (searchValue == root.val) {
			System.out.print("Found " + searchValue);
			return searchValue;
		}
		return -1;
	}

}
