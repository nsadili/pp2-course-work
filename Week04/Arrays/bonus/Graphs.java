package Week04.Arrays.bonus;

import java.util.Scanner;
public class Graphs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nbVertices = scan.nextInt();
        int nbEdges = scan.nextInt();

        int[][] listOfEdges = new int[nbEdges][2];
        for (int i = 0; i < nbEdges; i++) {
            listOfEdges[i][0] = scan.nextInt();
            listOfEdges[i][1] = scan.nextInt();
        }

        Graphs gr = new Graphs();
        int[][] mat = gr.listOfEdgesToMatrix(listOfEdges, nbVertices);
        gr.printMatrix(mat);

        scan.close();
    }

    int[][] listOfEdgesToMatrix(int[][] edges, int nbVertices) {
        int[][] matrix = new int[nbVertices + 1][nbVertices + 1];

        for (int i = 0; i < edges.length; i++) {
            matrix[edges[i][0]][edges[i][1]] = matrix[edges[i][1]][edges[i][0]] = 1;
        }

        return matrix;
    }

    void printMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
