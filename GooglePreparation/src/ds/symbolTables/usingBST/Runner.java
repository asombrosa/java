package ds.symbolTables.usingBST;

public class Runner {
    public static void main(String[] args) {
        BST<Integer, Integer> bst = new BST<>();
        bst.put(2,2);
        bst.put(12,12);
        bst.put(112,112);
        bst.put(1112,1112);
        bst.put(21,21);
        bst.put(211,211);
        bst.put(2111,2111);
        bst.put(121,121);
        bst.put(1121,1121);
        bst.put(1211,1211);
        bst.inorder();
        System.out.println(" Min : " + bst.min());
        System.out.println(" Max : " + bst.max());
        System.out.println(" Get value for key : " + bst.get(121));
        System.out.println(" Get floor value for key : " + bst.floor(121));
        System.out.println(" Get size for key : " + bst.size());
        System.out.println(" Get rank for key : " + bst.rank(2111));
        bst.delete(1121);
        bst.inorder();
    }
}
