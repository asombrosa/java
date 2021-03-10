package ds.graphs.undirectedgraph.dfs;

import ds.graphs.undirectedgraph.Graph;

import java.util.Stack;

/*
Steps :
    1. Mark current vertex true
    2. Get all connected vertices
    3. If connected vertex is not marked,
        select it as the current vertex
        and repeat the above steps

      6 ----- 4
     /      /   \
(S) 0 ---- 5 --- 3
    | \
    1  2

    DFS  : PATH TO 5
           5 => 3 => 4 => 6 => 0

    Time complexity : O( V + E )
 */
public class DepthFirstSearchPaths {
    boolean[] isMarked;
    int[] edgeTo;
    int source;

    DepthFirstSearchPaths(Graph g, int sourceVertex) {
        int vertices = g.getVertices();
        isMarked = new boolean[vertices];
        edgeTo = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            edgeTo[i] = -1;
        }
        source = sourceVertex;
        dfs(g, sourceVertex);
    }

    public void dfs(Graph g, int currentVertex) {
        isMarked[currentVertex] = true;
        for (int connectedVertex : g.adj(currentVertex)) {
            if (!isMarked[connectedVertex]) {
                dfs(g, connectedVertex);
                edgeTo[connectedVertex] = currentVertex;
            }
        }
    }

    public boolean hasPathTo(int v) {
        return isMarked[v];
    }

    public Iterable<Integer> pathTo(int vertex) {
        if (!hasPathTo(vertex)) {
            return null;
        }
        Stack<Integer> path = new Stack<>();
        for (int x = vertex; x != source; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(source);
        return path;
    }
}
