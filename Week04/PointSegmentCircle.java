public class Point {
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(x).append(", ").append(y).append(")");
        return sb.toString();
    }
}

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getLength() {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(p1.toString());
        sb.append(", ");
        sb.append(p2.toString());
        sb.append("]");
        return sb.toString();
    }
}

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle [center=").append(center.toString()).append(", radius=").append(radius).append("]");
        return sb.toString();
    }
}
