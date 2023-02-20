import java.util.Scanner;

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
            p[i].setx(scan.nextInt());
            p[i].sety(scan.nextInt());
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
        System.out.printf("Northern: (%d,%d)\nSouthern: (%d,%d)\nWestern: (%d,%d)\nEastern: (%d,%d)",
                p[north].getx(), p[north].gety(), p[south].getx(), p[south].gety(), p[west].getx(), p[west].gety(),
                p[east].getx(), p[east].gety());
    }
}

class Point {
    private int x;
    private int y;

    public Point() {
        this(1, 1);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }
}
