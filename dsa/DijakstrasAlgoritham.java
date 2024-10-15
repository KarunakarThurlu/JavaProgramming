package dsa;

import java.util.Arrays;

public class DijakstrasAlgoritham {

	private int V;
	private int E;

	private int[][] adjArray;

	public DijakstrasAlgoritham(int V) {
		this.V = V;
		this.adjArray = new int[V][V];

		for (int i = 0; i < V; i++) {
			Arrays.fill(adjArray[i], Integer.MAX_VALUE);
			adjArray[i][i] = 0;
		}
	}

	public void addEdge(int from, int to, int distance) {
		adjArray[from][to] = distance;
		this.E++;
	}

	public void findShortestDistance(int from, int to) {
		int[] distance = new int[V];
		boolean[] visited = new boolean[V];
		int[] previous = new int[V];

		Arrays.fill(distance, Integer.MAX_VALUE);
		Arrays.fill(previous, -1);
		distance[from] = 0;

		for (int i = 0; i < V - 1; i++) {
			int u = selectMinVertax(distance, visited);
			visited[u]=true;
			for(int v=0;v<V;v++) {
				
			}
		}

	}

	private int selectMinVertax(int[] distance, boolean[] visited) {
		int minDistance = Integer.MAX_VALUE;
		int minVertax = -1;
		for (int i = 0; i < V; i++) {
			if(!visited[i] && distance[i]<minDistance) {
				minDistance=distance[i];
				minVertax=i;
			}
		}
		return minVertax;
	}

	public static void main(String[] args) {

	}
}
