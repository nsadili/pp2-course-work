public class Point implements Movable, Cloneable {

    private float x;
    private float y; // field

    public Point() {
        // empty constructor(DEFAULT) their name is the same with class
        // this.x = 10;
        // this.y= 10;
        this(10, 10);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public float getX() {
        return this.x; // == return x;
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
        // 2 points
        // this > current object
        // p > new point object

        float dist = (float) Math.sqrt(
                Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));

        // Math.hypot(Math.pow(p.getX() - this.x, 2)
        // Math.pow(p.getY()- y, 2));

        return dist;
    }

    @Override
    public String toString() {

        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null)
            return false;

        if (!(obj instanceof Point))
            return false;

        Point that = (Point) obj; // downcasting(more specific to more general)

        return this.x == that.x && this.y == that.y;
    }

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
