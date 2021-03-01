package ds.geometricApplicationOfBST.intervalSearchTree;

public class Runner {
    public static void main(String[] args) {
        IntervalSearchTree<Integer> bst = new IntervalSearchTree<>();
        bst.put(17,19);
        bst.put(5,8);
        bst.put(15,18);
        bst.put(7,10);
        bst.put(4,8);
        bst.put(21,24);
        bst.inorder();
        System.out.println(bst.range(12,14));
        System.out.println(bst.range(22,23));
    }
}
