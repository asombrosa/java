package com.trees.bst.version1;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class BottomViewOfBinaryTree {

    void bottomView(Node root) {
        TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
        int hd = 0;
        getVerticalOrder(root, hd, map);

        for (Entry<Integer, Vector<Integer>> entry : map.entrySet()) {
            System.out.print(entry.getValue().get(entry.getValue().size() - 1) + " ");
        }
    }

    private void getVerticalOrder(Node root, int horizontalDistance, TreeMap<Integer, Vector<Integer>> map) {
        if (root == null) {
            return;
        }
        Vector<Integer> vector = map.get(horizontalDistance);
        if (vector == null) {
            vector = new Vector<>();
        }
        vector.add(root.value);
        map.put(horizontalDistance, vector);

        getVerticalOrder(root.leftChild, horizontalDistance - 1, map);
        getVerticalOrder(root.rightChild, horizontalDistance + 1, map);
    }
}
