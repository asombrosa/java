package com.trees.bst.version1;

public class Height {

	static int calculateHeight(Tree root) {
		if(root == null) {
			return 0;
		}
		int lh = calculateHeight(root.left);
		int rh = calculateHeight(root.right);
		if(lh > rh) {
			return lh+1;
		}else
			return rh+1;
		
	}
}
