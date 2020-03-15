package com.trees.bst;

import java.util.Stack;

public class TraversalsUsingStack {

	void inorder(Tree root) {
		if (root == null) {
			return;
		}
		Stack<Tree> stack = new Stack<Tree>();
		Tree element = root;
		while (element != null || stackNotEmpty(stack)) {
			while (element != null) {
				stack.push(element);
				element = element.left;
			}
			element = stack.pop();
			System.out.print(element.val + " ");
			element = element.right;

		}
	}

	void preorder(Tree root) {
		if (root == null) {
			return;
		}
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(root);
		while (stackNotEmpty(stack)) {
			Tree temp = stack.pop();
			System.out.print(temp.val + " ");
			if (temp.right != null)
				stack.push(temp.right);
			if (temp.left != null)
				stack.push(temp.left);
		}
	}
	
	void postorder(Tree root) {
		if(root == null) {
			return;
		}
		
	}

	private boolean stackNotEmpty(Stack<Tree> stack) {
		return !stack.isEmpty();
	}
}
