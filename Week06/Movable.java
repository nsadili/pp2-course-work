public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

public class Point implements Movable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Segment implements Movable {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void moveUp() {
        startPoint.moveUp();
        endPoint.moveUp();
    }

    @Override
    public void moveDown() {
        startPoint.moveDown();
        endPoint.moveDown();
    }

    @Override
    public void moveLeft() {
        startPoint.moveLeft();
        endPoint.moveLeft();
    }

    @Override
    public void moveRight() {
        startPoint.moveRight();
        endPoint.moveRight();
    }

    @Override
    public String toString() {
        return "[" + startPoint + ", " + endPoint + "]";
    }
}

public class Circle implements Movable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "[Circle with center " + center + " and radius " + radius + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Movable[] objects = new Movable[5];
        objects[0] = new Point(0, 0);
        objects[1] = new Segment(new Point(1, 1), new Point(3, 3));
        objects[2] = new Circle(new Point(2, 2), 2.0);
        objects[3] = new Point(-1, -1);
        objects[4] = new Segment(new Point(4, 4), new Point(6, 6));

        System.out.println("Before moving:");
        for (Movable object : objects) {
            System.out.println(object);
        }

        moveAll(objects, 2, 3);

        System.out.println("After moving:");
        for (Movable object : objects) {
            System.out.println(object);
        }
    }

    public static void moveAll(Movable[] objects, int x, int y) {
        for (Movable object : objects) {
            object.moveRight();
            object.moveDown();
        }
    }
}
