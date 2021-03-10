package unionFind.pathCompression;

/*
              5
            /   \
           3     4
          /\
         2  1

In normal cases :
  0   1   2   3   4   5
| 0 | 3 | 3 | 5 | 5 | 5 |

In path compression:
  0   1   2   3   4   5
| 0 | 5 | 5 | 5 | 5 | 5 |

We assume root of 2 and 1 to be 5, so the path is compressed and size of tree is even smaller

Time complexity : O(log N)

 */
public class PathCompressionQuickUnionUF {
    int[] id;
    int[] sizeOfTree;

    public PathCompressionQuickUnionUF(int N) {
        id = new int[N];
        sizeOfTree = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sizeOfTree[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; //
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
            id[pRoot] = qRoot; //parent of p is q
            sizeOfTree[qRoot] += sizeOfTree[pRoot];
        } else {
            id[qRoot] = pRoot; //parent of q is p
            sizeOfTree[pRoot] += sizeOfTree[qRoot];
        }
    }
}
