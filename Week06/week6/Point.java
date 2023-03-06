package pp2.week6;

import java.lang.Math;

public class Point {
    public float x;
    public float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }

    public float distance(Point p) {
        return (float) Math.sqrt(Math.abs((p.x - this.x)) * Math.abs((p.x - this.x))
                + Math.abs((p.y - this.y)) * Math.abs((p.y - this.y)));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // check if it's the same object
            return true;
        }
        if (!(obj instanceof Point)) { // check if it's a Point object
            return false;
        }
        Point other = (Point) obj; // cast the object to a Point
        return this.x == other.x && this.y == other.y;
    }

    @Override
    protected Point clone() {
        try {
            return (Point) super.clone();
        } catch (Exception e) {
            return new Point(this.x, this.y);
        }
    }
}
