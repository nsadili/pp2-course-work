import java.util.*;

public class Graphs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < m; i++) {

            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;

            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
