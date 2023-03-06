public class Exercise_4_i {
    private int[][] adjMatrix;
    private int numVertices;

    public Exercise_4_i(int[][] adjMatrix) {
        this.adjMatrix = adjMatrix;
        this.numVertices = adjMatrix.length;
    }

    public void printEdges() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                if (adjMatrix[i][j] == 1) {
                    System.out.println(i + " - " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] adjMatrix = {
            {0, 1, 0, 1},
            {1, 0, 1, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 0}
        };

        Exercise_4_i graph = new Exercise_4_i(adjMatrix);
        graph.printEdges();
    }
}