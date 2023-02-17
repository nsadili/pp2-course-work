package pp2.week4;

public class Point {
    int x;
    int y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point point) {
        this(point.x, point.y);
    }
}