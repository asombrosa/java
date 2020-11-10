package com.trees.bst.version1;

import java.util.Stack;

public class TraversalsUsingStack {

	void inorder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node element = root;
		while (element != null || stackNotEmpty(stack)) {
			while (element != null) {
				stack.push(element);
				element = element.leftChild;
			}
			element = stack.pop();
			System.out.print(element.value + " ");
			element = element.rightChild;

		}
	}

	void preorder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (stackNotEmpty(stack)) {
			Node temp = stack.pop();
			System.out.print(temp.value + " ");
			if (temp.rightChild != null)
				stack.push(temp.rightChild);
			if (temp.leftChild != null)
				stack.push(temp.leftChild);
		}
	}

	void postorder(Node root) {
		if (root == null) {
			return;
		}

	}

	private boolean stackNotEmpty(Stack<Node> stack) {
		return !stack.isEmpty();
	}
}
