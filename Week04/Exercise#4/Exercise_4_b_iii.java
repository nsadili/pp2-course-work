import java.util.Scanner;

public class Exercise_4_b_iii {
    private int[][] adjMatrix;
    private int numVertices;

    public Exercise_4_b_iii(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addingEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void printingMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        Exercise_4_b_iii graph = new Exercise_4_b_iii(n);
        for (int i = 0; i < m; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            graph.addingEdge(u-1, v-1);
        }
        graph.printingMatrix();
    }
}