package com.trees.bst.version1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Input : 20 10 5 15 30 25 35  
Output : Inorder before Deleting the leaf node  
          5 10 15 20 25 30 35  
         Inorder after Deleting the leaf node  
         10 20 30  
This is the binary search tree where we want to delete the leaf node.  
               20  

               / \  

             10  30  

            / \ / \  

           5 15 25 35  

After deleting the leaf node the binary search tree looks like  
               20 

               / \  

              10 30 
 */
public class InorderBeforeAndAfterDeletingLeafNodes {

	public static void main(String[] args) {
		int arr[] = { 20, 10, 5, 15, 30, 25, 35 }; // pre order - root left right

		Tree tree = createTreeFromPreOrder(arr);
		inorder(tree);
		System.out.println();
		tree = deleteNodes(tree);
		inorder(tree);
		System.out.println();

		/*
		 * List<Integer> list = preOrderToInorder(arr); System.out.println(list);
		 */

	}

	private static Tree deleteNodes(Tree tree) {
		boolean left = true;
		boolean right = true;
		tree = deleteLeafNodes(tree, right, left);
		return tree;
	}

	private static Tree deleteLeafNodes(Tree tree, boolean right, boolean left) {
		if (tree == null || (tree.right == null && tree.left == null)) {
			return tree;
		}
		if ((tree.left != null) && (tree.left.left == null && tree.left.right == null) && left) {
			tree.left = null;
			left = false;
		}
		if ((tree.right != null) && tree.right.right == null && tree.right.left == null && right) {
			tree.right = null;
			right = false;
		}
		deleteLeafNodes(tree.left, right, true);
		deleteLeafNodes(tree.right, true, left);

		return tree;
	}

	private static Tree createTreeFromPreOrder(int[] arr) {
		if (arr.length == 0)
			return null;
		Tree tree = null;
		for (int i = 0; i < arr.length; i++)
			tree = bst(arr[i], tree);
		return tree;
	}

	static void inorder(Tree root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	private static Tree bst(int v, Tree root) {
		if (root == null) {
			return new Tree(v);
		}
		if (v < root.val) {
			root.left = bst(v, root.left);
		}
		if (v > root.val) {
			root.right = bst(v, root.right);
		}
		return root;
	}

	private static List<Integer> preOrderToInorder(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		if (arr.length == 0)
			return list;
		stack.add(arr[0]);
		int i = 1;
		while (i < arr.length) {
			if (stack.empty() || arr[i] < stack.peek()) {
				stack.add(arr[i]);
				i++;
			} else {
				list.add(stack.pop());
			}
		}
		for (int element : stack) {
			list.add(element);
		}
		return list;
	}

}
