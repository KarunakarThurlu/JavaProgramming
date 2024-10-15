package dsa;

import java.util.Arrays;

public class WeightedGraph {

	private Integer[][] adjArray;
	private int V;

	public WeightedGraph() {
		super();
	}

	public WeightedGraph(int V) {
		this.adjArray = new Integer[V][V];
		this.V = V;
	}

	public void addEdge(int from, int to, int weight) {
		adjArray[from][to]=weight;
	}

	public void print() {
		System.out.println(Arrays.toString(adjArray[0]));
	}

	public static void main(String[] args) {
		WeightedGraph w = new WeightedGraph(4);
		w.print();
	}
}
