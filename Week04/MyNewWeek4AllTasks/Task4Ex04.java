import java.util.Scanner;

// iii. Convert list of edges to adjacency matrix


public class Task4Ex04 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // n = number of nodes
        int m = scan.nextInt(); // m = number of edges
        int[][] a = new int[n+1][n+1];
        // accept list of edges
        while(m-- > 0) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            a[i][j] = 1;
            a[j][i] = 1;
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
