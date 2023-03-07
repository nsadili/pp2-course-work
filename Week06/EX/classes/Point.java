package classes;
public class Point implements Point {
    private float x;
    private float y;
    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public float getX() {
        return this.x;
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
        return (float)Math.hypot(p.getX() - this.x, p.getY() - this.y);
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }
@Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

 @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
@Override
public void moveUp(int steps) {
    this.y ++;
}
@Override
public void moveDown(int steps) {
    this.y +=steps;
}
@Override
public void moveLeft(int steps) {
    this.x -= steps;
}
@Override
public void moveRight(int steps) {
    this.x += steps;
}
}
}