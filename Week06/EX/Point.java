package EX;

public class Point implements Cloneable, Movable {
    private float x;
    private float y;

    public Point() {
        this(0.0f, 0.0f);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
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

    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        if (!(obj instanceof Point))
            return false;
        Point that = (Point) obj;

        return that.x == this.x && that.y == this.y;
    }

    public String toString() {

        return "(" + x + "," + y + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
    // It is shallow copy method because only referance is copied

    @Override
    public Movable moveUp(int steps) {
        this.y += steps;
        return this;

    }

    @Override
    public Movable moveDown(int steps) {
        this.y -= steps;
        return this;

    }

    @Override
    public Movable moveLeft(int steps) {
        this.x -= steps;
        return this;
    }

    @Override
    public Movable moveRight(int steps) {
        this.x += steps;
        return this;
    }

}