import java.util.Scanner;

public class GraphBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int newmatrix[][] = new int [n+1] [n+1];    

        for(int i = 0;i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            newmatrix[a][b] = newmatrix[b][a] = 1;
        }
        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= n; j++){
                System.out.println(newmatrix[i][j] + " ");
            }
        }
        sc.close();
    }
}
