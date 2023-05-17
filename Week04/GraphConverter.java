import java.util.*;

public class GraphConverter {
    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1));
        edges.add(new Edge(0, 2));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 0));
        edges.add(new Edge(2, 3));

        int[][] adjacencyMatrix = convertToAdjacencyMatrix(edges);

        // Print the adjacency matrix
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] convertToAdjacencyMatrix(List<Edge> edges) {
        // Find the maximum vertex value to determine the size of the adjacency matrix
        int maxVertex = Integer.MIN_VALUE;
        for (Edge edge : edges) {
            maxVertex = Math.max(maxVertex, Math.max(edge.source, edge.destination));
        }

        // Create the adjacency matrix
        int[][] adjacencyMatrix = new int[maxVertex + 1][maxVertex + 1];

        // Populate the adjacency matrix
        for (Edge edge : edges) {
            adjacencyMatrix[edge.source][edge.destination] = 1;
        }

        return adjacencyMatrix;
    }

    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }
}
