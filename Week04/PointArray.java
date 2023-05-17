package Week04;

import java.util.Scanner;

public class PointArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[][] points = new int[n][2];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                points[i][0] = x;
                points[i][1] = y;
            }
            int north = 0;
            int south = 0;
            int west = 0;
            int east = 0;

            for (int i = 0; i < n; i++) {
                if ((points[i][1]) > (points[north][1]))
                    north = i;
                if ((points[i][1]) < (points[south][1]))
                    south = i;
                if ((points[i][1]) < (points[west][1]))
                    west = i;
                if ((points[i][1]) > (points[east][1]))
                    north = i;
            }
            System.out.println("Northern: " + points[north][0] + ", " + points[north][1]);
            System.out.println("Southern:" + points[south][0] + ", " + points[south][1]);
            System.out.println("Western: " + points[west][0] + ", " + points[west][1]);
            System.out.println("Eastern: " + points[east][0] + ", " + points[east][1]);
        }
    }
}
