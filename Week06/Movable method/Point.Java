interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Segment implements Movable {
    private Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }

    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }

    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }

    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }

    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }
}

class Circle implements Movable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle(center=" + center.toString() + ", radius=" + radius + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Movable[] objects = { new Point(0, 0), new Segment(new Point(1, 2), new Point(3, 4)), new Circle(new Point(5, 6), 7) };

        for (Movable object : objects) {
            System.out.println(object.toString());
        }

        moveObjects(objects, 1, 2);
        System.out.println("---");
        for (Movable object : objects) {
            System.out.println(object.toString());
        }
    }

    public static void moveObjects(Movable[] objects, int dx, int dy) {
        for (Movable object : objects) {
            object.moveRight();
            object.moveDown();
        }
    }
}