import java.util.Scanner;

import pp2.Point.Point;


public class ArraysofPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of points: ");
        int a = scan.nextInt();
        System.out.print("Please enter the points: ");
        Point[] p = new Point[a];
        int north = 0, south = 0, east = 0, west = 0;

        for (int i = 0; i < a; i++) {
            p[i] = new Point(); // create a new Point object and assign it to the array
            p[i].setx(scan.nextFloat());
            p[i].sety(scan.nextFloat());
        }

        for (int i = 0; i < a; i++) {
            if (p[i].gety() > p[north].gety())
                north = i;
            if (p[i].getx() > p[east].getx())
                east = i;
            if (p[i].gety() < p[south].gety())
                south = i;
            if (p[i].getx() < p[west].getx())
                west = i;
        }
        System.out.printf("Northern: (%f,%f)\nSouthern: (%f,%f)\nWestern: (%f,%f)\nEastern: (%f,%f)",
                p[north].getx(), p[north].gety(), p[south].getx(), p[south].gety(), p[west].getx(), p[west].gety(),
                p[east].getx(), p[east].gety());
    }
}



