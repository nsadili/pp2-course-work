package Week04.Array;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return 0;
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point[] points = {
            new Point(2, 3),
            new Point(-1, 5),
            new Point(0, 0),
            new Point(4, 1),
            new Point(2, 2),
            new Point(-3, -2),
            new Point(3, -1)
        };

        Point northern = points[0], southern = points[0], western = points[0], eastern = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].y > northern.y) {
                northern = points[i];
            }
            if (points[i].y < southern.y) {
                southern = points[i];
            }
            if (points[i].x < western.x) {
                western = points[i];
            }
            if (points[i].x > eastern.x) {
                eastern = points[i];
            }
        }

        System.out.println("Northernmost point: " + northern);
        System.out.println("Southernmost point: " + southern);
        System.out.println("Westernmost point: " + western);
        System.out.println("Easternmost point: " + eastern);
    }
}
