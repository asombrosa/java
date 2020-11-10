package com.trees.bst.version1;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class TraversalsWithRecursion {

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.leftChild);
        System.out.print(root.value + " ");
        inorder(root.rightChild);
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.leftChild);
        postorder(root.rightChild);
        System.out.print(root.value + " ");
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.leftChild);
        preorder(root.rightChild);
    }

    void levelOrderTraversal(Node root, int height) {
        if (root == null) {
            return;
        }
        if (height == 1) {
            System.out.print(root.value + " ");
        } else if (height > 1) {
            levelOrderTraversal(root.leftChild, height - 1);
            levelOrderTraversal(root.rightChild, height - 1);
        }
    }

    void levelOrder(Node root) {
        int height = Height.calculateHeight(root);
        for (int index = 1; index <= height; index++) {
            levelOrderTraversal(root, index);
            System.out.println();
        }
    }

    void verticalOrderTraversal(Node root, int horizontalDistance, TreeMap<Integer, Vector<Integer>> map) {
        if (root == null)
            return;
        Vector<Integer> vector = map.get(horizontalDistance);
        if (vector == null) {
            vector = new Vector<>();
        }
        vector.add(root.value);
        map.put(horizontalDistance, vector);

        verticalOrderTraversal(root.leftChild, horizontalDistance - 1, map);
        verticalOrderTraversal(root.rightChild, horizontalDistance + 1, map);
    }

    void verticalOrder(Node root) {
        TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
        int horizontalDistance = 0;
        verticalOrderTraversal(root, horizontalDistance, map);

        for (Entry<Integer, Vector<Integer>> entry : map.entrySet())
            System.out.println(entry.getValue());
    }
}
