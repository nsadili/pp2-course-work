package practicalwork;

import java.util.Scanner;

public class GraphTask {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the number of vertices: ");
		
		int numVertices = scn.nextInt();
		
		System.out.print("Enter the number of edges: ");
		
		int numEdges = scn.nextInt();

		int[][] edges = new int[numEdges][2];
		
		for (int i = 0; i < numEdges; i++) {
			System.out.print("Enter edge " + (i + 1) + " (in the form u v): ");
			edges[i][0] = scn.nextInt();
			edges[i][1] = scn.nextInt();
		}

		int[][] adjMatrix = convertEdgesToAdjMatrix(edges, numVertices);

		System.out.println("Adjacency Matrix:");
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] convertEdgesToAdjMatrix(int[][] edges, int numVertices) {
		int[][] adjMatrix = new int[numVertices][numVertices];
		for (int i = 0; i < edges.length; i++) {
			int u = edges[i][0];
			int v = edges[i][1];
			adjMatrix[u][v] = 1;
			adjMatrix[v][u] = 1; 
		}
		
		return adjMatrix;
	}
}
