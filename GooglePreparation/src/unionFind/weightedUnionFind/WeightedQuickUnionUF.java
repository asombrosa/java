package unionFind.weightedUnionFind;

/*

Always make smaller tree the child, so that height of
tree is not elongated
Time complexity of union : O(log N)

 */
public class WeightedQuickUnionUF {
    int[] id;
    int[] sizeOfTree;

    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        sizeOfTree = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sizeOfTree[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        if (pRoot == qRoot) {
            return;
        } else if (sizeOfTree[pRoot] < sizeOfTree[qRoot]) {
            id[pRoot] = qRoot; // parent of p is q
            sizeOfTree[qRoot] += sizeOfTree[pRoot];
        } else {
            id[qRoot] = pRoot; // parent of q is p
            sizeOfTree[pRoot] += sizeOfTree[qRoot];
        }
    }
}
