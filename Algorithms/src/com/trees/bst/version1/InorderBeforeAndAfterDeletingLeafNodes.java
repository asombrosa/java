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
This is the binary search node where we want to delete the leaf node.
               20  

               / \  

             10  30  

            / \ / \  

           5 15 25 35  

After deleting the leaf node the binary search node looks like
               20 

               / \  

              10 30 
 */
public class InorderBeforeAndAfterDeletingLeafNodes {

    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 15, 30, 25, 35}; // pre order - root left right

        Node node = createTreeFromPreOrder(arr);
        inorder(node);
        System.out.println();
        node = deleteNodes(node);
        inorder(node);
        System.out.println();

        /*
         * List<Integer> list = preOrderToInorder(arr); System.out.println(list);
         */

    }

    private static Node deleteNodes(Node node) {
        node = deleteLeafNodes(node, true, true);
        return node;
    }

    private static Node deleteLeafNodes(Node node, boolean right, boolean left) {
        if (node == null || (node.rightChild == null && node.leftChild == null)) {
            return node;
        }
        if ((node.leftChild != null) && (node.leftChild.leftChild == null && node.leftChild.rightChild == null) && left) {
            node.leftChild = null;
            left = false;
        }
        if ((node.rightChild != null) && node.rightChild.rightChild == null && node.rightChild.leftChild == null && right) {
            node.rightChild = null;
            right = false;
        }
        deleteLeafNodes(node.leftChild, right, true);
        deleteLeafNodes(node.rightChild, true, left);

        return node;
    }

    private static Node createTreeFromPreOrder(int[] arr) {
        if (arr.length == 0)
            return null;
        Node node = null;
		for (int j : arr) node = bst(j, node);
        return node;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.leftChild);
        System.out.print(root.value + " ");
        inorder(root.rightChild);
    }

    private static Node bst(int v, Node root) {
        if (root == null) {
            return new Node(v);
        }
        if (v < root.value) {
            root.leftChild = bst(v, root.leftChild);
        }
        if (v > root.value) {
            root.rightChild = bst(v, root.rightChild);
        }
        return root;
    }

    private static List<Integer> preOrderToInorder(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
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
