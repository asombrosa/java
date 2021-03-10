package unionFind.pathCompression;

public class RunnerPCQUUF {
    public static void main(String[] args) {
        PathCompressionQuickUnionUF pathCompressionQuickUnionUF = new PathCompressionQuickUnionUF(10);
        pathCompressionQuickUnionUF.union(4, 3);
        pathCompressionQuickUnionUF.union(3, 8);
        pathCompressionQuickUnionUF.union(6, 5);
        pathCompressionQuickUnionUF.union(9, 4);
        pathCompressionQuickUnionUF.union(2, 1);
        System.out.println(pathCompressionQuickUnionUF.connected(0, 7));
        System.out.println(pathCompressionQuickUnionUF.connected(8, 9));
        pathCompressionQuickUnionUF.union(5, 0);
        pathCompressionQuickUnionUF.union(7, 2);
        pathCompressionQuickUnionUF.union(6, 1);
        pathCompressionQuickUnionUF.union(1, 0);
        System.out.println(pathCompressionQuickUnionUF.connected(0, 7));
    }
}
