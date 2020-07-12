package com.trees.bst;

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
public class SprialOrderTraversal {

	void levelOrderTraversal(Tree root, int height, Stack<Integer> stack) {
		if (root == null) {
			return;
		}
		if (height == 1) {
			// System.out.print(root.val + " ");
			stack.add(root.val);
		} else if (height > 1) {
			levelOrderTraversal(root.left, height - 1, stack);
			levelOrderTraversal(root.right, height - 1, stack);
		}
	}

	void levelOrder(Tree root) {
		int height = Height.calculateHeight(root);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= height; i++) {
			levelOrderTraversal(root, i, stack);
			while (!stack.isEmpty() && i % 2 == 0)
				System.out.print(stack.pop() + " ");
			for (int ele : stack) {
				System.out.print(ele + " ");
			}
			stack.clear();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		InsertAndSearchInBST insertAndSearchInBST = new InsertAndSearchInBST();
		SprialOrderTraversal spiral = new SprialOrderTraversal();
		Tree root = null;
		root = insertAndSearchInBST.insert(20, root);
		insertAndSearchInBST.insert(10, root);
		insertAndSearchInBST.insert(30, root);
		insertAndSearchInBST.insert(5, root);
		insertAndSearchInBST.insert(15, root);
		insertAndSearchInBST.insert(25, root);
		insertAndSearchInBST.insert(35, root);
		spiral.levelOrder(root);
	}

}
