package BonusTasks.Week04.Graphs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    arr[i][j] = 0;
            }
            while (m-- > 0) {
                int i = sc.nextInt() - 1, j = sc.nextInt() - 1;
                arr[i][j] = 1;
                arr[j][i] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}