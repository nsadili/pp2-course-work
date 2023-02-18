import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class ArrayofPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int n = sc.nextInt();
        sc.nextLine();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Point " + (i + 1) + ":");
            System.out.println("X: ");
            int x = sc.nextInt();
            sc.nextLine();
            System.out.println("Y: ");
            int y = sc.nextInt();
            sc.nextLine();
            points[i] = new Point(x, y);
        }
        int mostNorth = 0;
        int mostSouth = 0;
        int mostWest = 0;
        int mostEast = 0;
        for (int i = 0; i < n; i++) {
            if (points[i].getY() > points[mostNorth].getY()) {
                mostNorth = i;
            }
            if (points[i].getY() < points[mostSouth].getY()) {
                mostSouth = i;
            }
            if (points[i].getX() < points[mostWest].getX()) {
                mostWest = i;
            }
            if (points[i].getX() > points[mostEast].getX()) {
                mostEast = i;
            }
        }
        System.out.println("Most Northern: " + points[mostNorth].getX() + ", " + points[mostNorth].getY());
        System.out.println("Most Southern: " + points[mostSouth].getX() + ", " + points[mostSouth].getY());
        System.out.println("Most Western: " + points[mostWest].getX() + ", " + points[mostWest].getY());
        System.out.println("Most Eastern: " + points[mostEast].getX() + ", " + points[mostEast].getY());
    }
}