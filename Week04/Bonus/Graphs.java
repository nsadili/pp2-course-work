package Bonus;

public class Graphs{
public static int[][] edgesToAdjMatrix(int[][] edges, int numVertices) {
    int[][] adjMatrix = new int[numVertices][numVertices];
    for (int i = 0; i < edges.length; i++) {
        int source = edges[i][0];
        int destination = edges[i][1];
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }
    return adjMatrix;
}
}