package Week04.PW;

import java.util.Scanner;

public class Array {

    int x, y;

    public Array(int maxValue, int i) {
    }

    public static void main(String[] args) {

        int x, y;


        Array north = new Array(0, Integer.MIN_VALUE);
        Array south = new Array(0, Integer.MAX_VALUE);
        Array east = new Array(Integer.MIN_VALUE, 0);
        Array west = new Array(Integer.MAX_VALUE, 0);

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                System.out.println("enter x and y coordinates");

                x = sc.nextInt();
                y = sc.nextInt();
                if (x > east.x) {
                    east.x = x;
                    east.y = y;
                    System.out.printf("Eastern most: %d %d\n", east.x, east.y);

                }
                if (x < west.x) {
                    west.x = x;
                    west.y = y;
                    System.out.printf("Western most: %d %d\n", west.x, west.y);

                }
                if (y > north.y) {
                    north.x = x;
                    north.y = y;
                    System.out.printf("Northern most: %d %d\n", north.x, north.y);

                }
                if (y < south.y) {
                    south.x = x;
                    south.y = y;
                    System.out.printf("Southern most: %d %d\n", south.x, south.y);

                }

            }
        }
    }
}