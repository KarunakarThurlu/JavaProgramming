package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	/*
	Graph:- Graph(V,E) is collection of vertices(V) and edges(E).
	-------
	
	Vertices: Vertices are the fundamental units of the graph
	--------
	
	Edges: Edges are drawn or used to connect two nodes of the graph.
	-------
	
	1. Graph is Non-Linear Data Structure.
	2. It is used to represent relationships between different entities.
	3. It can be used to solve problems like finding the shortest path or detecting cycles.
	
	Types of Graph's:-
	------------------
	1. Null Graph : A Graph with no edges
	2. Trivial Graph : A Graph with single vertex
	3. Undirected Graph : A graph in which edges do not have any direction.
	4. Directed Graph : A graph in which edge has direction.
	5. Connected Graph : The graph in which from one node we can visit any other node.
	6. Disconnected Graph : The graph in which at least one node is not reachable from a node
	7. Regular Graph : The graph in which the degree of every vertex is equal to K is called K regular graph.
	8. Complete Graph : The graph in which from each node there is an edge to each other node.
    9. Cycle Graph : The graph in which the graph is a cycle in itself, the degree of each vertex is 2.
    10. Cyclic Graph : A graph containing at least one cycle is known as a Cyclic graph.
    11. Weighted Graph : A graph in which the edges are specified with suitable weight.
    
    Representation of Graph :- There are two ways to represent a graph.
    -------------------------
    1. Adjacency Matrix
	2. Adjacency List
	
	----------------------------------------------------------------------
	Action				Adjacency Matrix	Adjacency List
	----------------------------------------------------------------------
    Adding Edge				O(1)				O(1)
    Removing an edge		O(1)				O(N)
    Initializing			O(N*N)				O(N)
    ----------------------------------------------------------------------
    
    */
    private int[][] adjArray;
    private int V;
    private int E;

    public Graph(int V) {
        adjArray = new int[V][V];
        this.V=V;
        this.E=0;
    }

    public void addEdge(int from ,int to){
        adjArray[from][to]=1;
        adjArray[to][from]=1;
        E++;
    }

    public List<Integer> BFStraversal(int startVertax){
    	List<Integer> bfsList=new ArrayList<>();
    	Queue<Integer> q=new LinkedList<>();
    	boolean[] trace = new boolean[V];
    	q.offer(startVertax);
    	trace[startVertax]=true;
    	while(!q.isEmpty()) {
    		Integer poll = q.poll();
    		bfsList.add(poll);
    		for(int i=0;i<trace.length;i++) {
    			if(adjArray[poll][i]==1 && trace[i]==false) {
    				q.offer(i);
    				trace[i]=true;
    			}
    		}
    	}
    	return bfsList;
    }
    
    public List<Integer> DFStraversal(int startVertax) {
    	List<Integer> l = new ArrayList<>();
    	Stack<Integer> s=new Stack<>();
    	boolean[] trace=new boolean[V];
    	s.push(startVertax);
    	trace[startVertax]=true;
    	while(!s.isEmpty()) {
    		Integer pop = s.pop();
    		l.add(pop);
    		for(int i=0;i<trace.length;i++) {
    			if(adjArray[pop][i]==1 && trace[i]==false) {
    				s.push(i);
    				trace[i]=true;
    			}
    		}
    	}
    	return l;
    }

    public void print() {
    	  for(int i=0;i<adjArray.length;i++) {
    		  for(int j=0;j<adjArray.length;j++)
    			  System.out.print(adjArray[i][j]+" ");
    	      System.out.println();
    	  }
    }
    
    public static void main(String[] args) {
        Graph g=new Graph(5);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.print();
        List<Integer> bfStraversal = g.BFStraversal(2);
        System.out.println(bfStraversal);
        List<Integer> dfStraversal = g.DFStraversal(3);
        System.out.println(dfStraversal);
    }
}
