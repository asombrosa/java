package com.trees.bst.version1;

public class InsertAndSearchInBST {
    Node insert(int valueToBeInserted, Node root) {
        if (root == null) {
            return new Node(valueToBeInserted);
        }
        if (valueToBeInserted < root.value) {
            root.leftChild = insert(valueToBeInserted, root.leftChild);
        }
        if (valueToBeInserted > root.value) {
            root.rightChild = insert(valueToBeInserted, root.rightChild);
        }
        return root;
    }

    int search(int searchValue, Node root) {
        if (root == null) {
            System.out.print("Element Not Found");
            return -1;
        }
        if (searchValue < root.value)
            search(searchValue, root.leftChild);
        else if (searchValue > root.value)
            search(searchValue, root.rightChild);
        else {
            System.out.print("Found " + searchValue);
            return searchValue;
        }
        return -1;
    }

}
