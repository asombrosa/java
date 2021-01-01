package com.trees.bst.version2;

public class Runner {
    public static void main(String[] args) {
        int[] sample = {52, 33, 65, 25, 39, 60, 78, 12, 27, 34, 48, 72, 90, 70};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int x : sample) {
            binarySearchTree.insert(x);
        }
    }
}
