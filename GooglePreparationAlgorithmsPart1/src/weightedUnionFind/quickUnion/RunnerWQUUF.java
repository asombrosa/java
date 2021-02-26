package weightedUnionFind.quickUnion;

public class RunnerWQUUF {
    public static void main(String[] args) {
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(10);
        weightedQuickUnionUF.union(4, 3);
        weightedQuickUnionUF.union(3, 8);
        weightedQuickUnionUF.union(6, 5);
        weightedQuickUnionUF.union(9, 4);
        weightedQuickUnionUF.union(2, 1);
        System.out.println(weightedQuickUnionUF.connected(0, 7));
        System.out.println(weightedQuickUnionUF.connected(8, 9));
        weightedQuickUnionUF.union(5, 0);
        weightedQuickUnionUF.union(7, 2);
        weightedQuickUnionUF.union(6, 1);
        weightedQuickUnionUF.union(1, 0);
        System.out.println(weightedQuickUnionUF.connected(0, 7));
    }
}
