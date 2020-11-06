package com.trees.bst.version1;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 				20
 * 			  /	   \
 * 		     10    30
 * 			/  \   / \
 * 		   5   15 25  35
 * 
 * 
 * 
 * Output:    
 * 		5  	15	25	35
 * 		 \  /    \  /
 * 		  10      30
 * 			\     /
 * 			   20
 */
public class ReverseLevelOrderTranversal {

	public static void main(String[] args) {
		InsertAndSearchInBST insertAndSearchInBST = new InsertAndSearchInBST();
		Tree root = null;
		root = insertAndSearchInBST.insert(20, root);
		insertAndSearchInBST.insert(10, root);
		insertAndSearchInBST.insert(30, root);
		insertAndSearchInBST.insert(5, root);
		insertAndSearchInBST.insert(15, root);
		insertAndSearchInBST.insert(25, root);
		insertAndSearchInBST.insert(35, root);
		reverseLevelOrder(root);

	}

	private static void reverseLevelOrder(Tree root) {
		int height = Height.calculateHeight(root);
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = height; i >= 1; i--) {
			reverseLevelOrderTraversal(root, i);

			queue.clear();
			System.out.println();
		}

	}

	private static void reverseLevelOrderTraversal(Tree root, int height) {
		if (root == null)
			return;
		if (height == 1) {
			System.out.print(root.val + " ");
		} else if (height > 1) {
			reverseLevelOrderTraversal(root.left, height - 1);
			reverseLevelOrderTraversal(root.right, height - 1);

		}

	}

}
