package com.trees.bst;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class TopViewOfBinaryTree {

	void topView(Tree root) {
		TreeMap<Integer, Vector<Integer>> map = new TreeMap<Integer, Vector<Integer>>();
		int hd = 0;
		getVerticalOrder(root, hd, map);
		
		for(Entry<Integer, Vector<Integer>> k : map.entrySet()) {
			System.out.print(k.getValue().get(0) + " ");
		}
	}

	private void getVerticalOrder(Tree root, int hd, TreeMap<Integer, Vector<Integer>> map) {
		if (root == null) {
			return;
		}

		Vector<Integer> v = map.get(hd);
		if (v == null) {
			v = new Vector<Integer>();
		}
		v.add(root.val);
		map.put(hd, v);

		getVerticalOrder(root.left, hd - 1, map);
		getVerticalOrder(root.right, hd + 1, map);
	}
}
