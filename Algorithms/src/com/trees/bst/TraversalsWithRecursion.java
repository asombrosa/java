package com.trees.bst;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class TraversalsWithRecursion {

	void inorder(Tree root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	void postorder(Tree root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val + " ");
	}

	void preorder(Tree root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	void levelOrderTraversal(Tree root, int height) {
		if (root == null) {
			return;
		}
		if (height == 1)
			System.out.print(root.val + " ");
		else if (height > 1) {
			levelOrderTraversal(root.left, height - 1);
			levelOrderTraversal(root.right, height - 1);
		}
	}

	void levelOrder(Tree root) {
		int height = Height.calculateHeight(root);
		for (int i = 1; i <= height; i++) {
			levelOrderTraversal(root, i);
			System.out.println();
		}
	}

	void verticalOrderTraversal(Tree root, int hd, TreeMap<Integer, Vector<Integer>> map) {
		if (root == null)
			return;
		Vector<Integer> v = map.get(hd);
		if (v == null) {
			v = new Vector<Integer>();
		}
		v.add(root.val);
		map.put(hd, v);

		verticalOrderTraversal(root.left, hd - 1, map);
		verticalOrderTraversal(root.right, hd + 1, map);
	}

	void verticalOrder(Tree root) {
		TreeMap<Integer, Vector<Integer>> map = new TreeMap<Integer, Vector<Integer>>();
		int hd = 0;
		verticalOrderTraversal(root, hd, map);

		for (Entry<Integer, Vector<Integer>> entry : map.entrySet())
			System.out.println(entry.getValue());

	}
}
