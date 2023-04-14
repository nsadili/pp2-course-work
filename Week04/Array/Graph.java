public class Graph {
    private int[][] adjacencyMatrix;
    private List<Edge> edges;

    public Graph(List<Edge> edges, int numberOfVertices) {
        this.edges = edges;
        adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
        for (Edge edge : edges) {
            int source = edge.getSource();
            int destination = edge.getDestination();
            adjacencyMatrix[source][destination] = 1;
            // Uncomment the line below if the graph is undirected
            // adjacencyMatrix[destination][source] = 1;
        }
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public static void main(String[] args) {
        // Create a list of edges
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1));
        edges.add(new Edge(0, 2));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 3));
        edges.add(new Edge(3, 3));

        // Create a graph from the list of edges
        Graph graph = new Graph(edges, 4);

        // Get the adjacency matrix
        int[][] adjacencyMatrix = graph.getAdjacencyMatrix();

        // Print the adjacency matrix
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Edge {
    private int source;
    private int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }
}

