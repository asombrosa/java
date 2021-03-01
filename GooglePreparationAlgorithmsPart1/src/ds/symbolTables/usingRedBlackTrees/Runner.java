package ds.symbolTables.usingRedBlackTrees;

import ds.symbolTables.usingBST.BST;

public class Runner {
    public static void main(String[] args) {
        RedBlackTree<Integer, Integer> bst = new RedBlackTree<>();
        bst.put(5,2);
        bst.put(12,12);
        bst.put(11,112);
        bst.put(9,1112);
        bst.put(21,21);
        bst.put(17,211);
        bst.put(2,2111);
        bst.put(10,121);
        bst.put(20,1121);
        bst.put(18,1211);
        bst.inorder();
    }
}
