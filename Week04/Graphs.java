import java.util.Scanner;

public class Graphs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); 
        int m = scan.nextInt(); 

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            int u = scan.nextInt() - 1;  
            int v = scan.nextInt() - 1; 
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
