package com.graphs;

public class GraphRunner {
	public static void main(String args[]) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		BFS bfs = new BFS();
		bfs.bfs(2, g);

		System.out.println();
		System.out.println("Following is Depth First Traversal "+ 
                "(starting from vertex 2)"); 

		DFS dfs = new DFS();
		dfs.dfs(2, g);
		
		System.out.println();
		Graph g1 = new Graph(4);

		g1.addEdge(0, 1);
	//	g1.addEdge(0, 2);
		g1.addEdge(1, 2);
	//	g1.addEdge(2, 0);
		g1.addEdge(2, 3);
	//	g1.addEdge(3, 3);

		DetectCycleInDirectedGraph detectCycleInDirectedGraph = new DetectCycleInDirectedGraph();
		if(detectCycleInDirectedGraph.isCyclic(2, g1))
			System.out.println("Cycle detected for g1");
		else
			System.out.println("No cycle found for g1");
		if(detectCycleInDirectedGraph.isCyclic(2, g))
			System.out.println("Cycle detected for g");
		else
			System.out.println("No cycle found for g");
	}
}
