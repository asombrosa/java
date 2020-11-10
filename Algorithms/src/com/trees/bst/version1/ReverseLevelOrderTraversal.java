package com.trees.bst.version1;

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
public class ReverseLevelOrderTraversal {

    public static void main(String[] args) {
        InsertAndSearchInBST insertAndSearchInBST = new InsertAndSearchInBST();
        Node root;
        root = insertAndSearchInBST.insert(20, null);
        insertAndSearchInBST.insert(10, root);
        insertAndSearchInBST.insert(30, root);
        insertAndSearchInBST.insert(5, root);
        insertAndSearchInBST.insert(15, root);
        insertAndSearchInBST.insert(25, root);
        insertAndSearchInBST.insert(35, root);
        reverseLevelOrder(root);
    }

    private static void reverseLevelOrder(Node root) {
        int height = Height.calculateHeight(root);
        for (int index = height; index >= 1; index--) {
            reverseLevelOrderTraversal(root, index);
            System.out.println();
        }
    }

    private static void reverseLevelOrderTraversal(Node root, int height) {
        if (root == null)
            return;
        if (height == 1) {
            System.out.print(root.value + " ");
        } else if (height > 1) {
            reverseLevelOrderTraversal(root.leftChild, height - 1);
            reverseLevelOrderTraversal(root.rightChild, height - 1);
        }
    }
}