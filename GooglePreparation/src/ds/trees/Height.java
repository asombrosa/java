package ds.trees;

public class Height<K extends Comparable<K>> {

    public static int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftSubTreeHeight = height(node.left);
        int rightSubTreeHeight = height(node.right);

        if (leftSubTreeHeight > rightSubTreeHeight) {
            return leftSubTreeHeight + 1;
        } else {
            return rightSubTreeHeight + 1;
        }
    }

}
