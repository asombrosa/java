package com.graphs;

import java.util.LinkedList;

public class Graph {

	int V;
	LinkedList<Integer> adj[];
	
	Graph(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i =0 ; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int source, int destination) {
		adj[source].add(destination);
	}
}
