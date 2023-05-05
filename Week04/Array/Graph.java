package Week04.Array;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Edge> edgeList;
    private List<List<Integer>> adjList;
    private int numVertices;
    public Graph(int[][] adjMatrix) {
        this.numVertices = adjMatrix.length;
        this.edgeList = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] != 0) {
                    edgeList.add(new Edge(i, j, adjMatrix[i][j]));
                }
            }
        }

        this.adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] != 0) {
                    adjList.get(i).add(j);
                }
            }
        }
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    public List<List<Integer>> getAdjList() {
        return adjList;
    }

    public int[][] toAdjMatrix() {
        int[][] adjMatrix = new int[numVertices][numVertices];

        for (Edge edge : edgeList) {
            adjMatrix[edge.getSource()][edge.getDest()] = edge.getWeight();
        }

        return adjMatrix;
    }

    public static class Edge {
        private int source;
        private int dest;
        private int weight;

        public Edge(int source, int dest, int weight) {
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }

        public int getSource() {
            return source;
        }

        public int getDest() {
            return dest;
        }

        public int getWeight() {
            return weight;
        }
    }
}
