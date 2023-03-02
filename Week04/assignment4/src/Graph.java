import java.util.*;

public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    public int[][] convertToAdjacencyMatrix(List<int[]> edges) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            addEdge(u, v);
        }
        return adjMatrix;
    }

    public static void main(String[] args) {
        List<int[]> edges = new ArrayList<>();
        edges.add(new int[] { 3, 3 });
        edges.add(new int[] { 1, 2 });
        edges.add(new int[] { 2, 3 });
        edges.add(new int[] { 1, 3 });

        Graph graph = new Graph(4);
        int[][] adjMatrix = graph.convertToAdjacencyMatrix(edges);

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
