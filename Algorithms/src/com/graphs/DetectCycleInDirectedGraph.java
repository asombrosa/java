package com.graphs;

import java.util.List;

/*
 * Given a directed graph, check whether the graph contains a cycle or not. 
 * Your function should return true if the given graph contains at least one cycle,
 * else return false. For example, the following graph contains three cycles 
 * 0->2->0, 0->1->2->0 and 3->3, so your function must return true.
 * 
 * https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
 * 
 */
public class DetectCycleInDirectedGraph {

	boolean isCyclic(int s,Graph g) {
		boolean visited[] = new boolean[g.V];
		
		for(int i=0;i<g.V;i++)
			if(isCyclicUtil(i,visited,g))
				return true;
		return false;
	}

	private boolean isCyclicUtil(int i, boolean[] visited,Graph g) {
		
		if(visited[i])
			return true;
		visited[i]=true;
		
		List<Integer> list = g.adj[i];
		
		for(Integer c: list)
			if(isCyclicUtil(c, visited, g))
				return true;
		visited[i] = false;
		return false;
	}
}
