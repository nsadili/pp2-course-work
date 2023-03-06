package ex1_5_6;

public class Point extends Object implements Movable {
    private float x;
    private float y;

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
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        float dist = (float) Math.sqrt( Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2) );
        return dist;
    }

    public boolean equals(Object obj) {
        Point p = (Point) obj;
        return p.x == this.x && this.y == p.y;
    }

    public String toString() {
        return "[(" + x + ", " + y + ")]";
    }

    protected Point clone() {
        Point p = new Point(x, y);
        return p;
    }

    public void moveUp() {
        y++;
    }
    public void moveDown() {
        y--;
    }
    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
}