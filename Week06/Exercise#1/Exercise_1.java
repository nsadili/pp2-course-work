package weel06;

public class Point {
    private float x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        return (float) (Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return (this.x == p.getX() && this.y == p.getY());
        }
        return false;
    }
}

package week06;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p) {
        this.p2 = p;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return this.p1.distance(this.p2);
    }

    public float getSlope() {
        float deltaX = this.p2.getX() - this.p1.getX();
        float deltaY = this.p2.getY() - this.p1.getY();

        if (deltaX == 0) {
            return Float.POSITIVE_INFINITY;
        } else {
            return deltaY / deltaX;
        }
    }

    public float getIntercept() {
        return this.p1.getY() - this.getSlope() * this.p1.getX();
    }

    public boolean isOnLine(Point p) {
        float expectedY = this.getSlope() * p.getX() + this.getIntercept();
        return p.getY() == expectedY;
    }

    public boolean isOnSegment(Point p) {
        float x1 = this.p1.getX();
        float y1 = this.p1.getY();
        float x2 = this.p2.getX();
        float y2 = this.p2.getY();
        float minX = Math.min(x1, x2);
        float maxX = Math.max(x1, x2);
        float minY = Math.min(y1, y2);
        float maxY = Math.max(y1, y2);
        return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }
}