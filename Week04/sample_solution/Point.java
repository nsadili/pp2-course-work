/**
 * @author Nuraddin Sh. Sadili
 */
public class Point {
    private float x; // field
    private float y; // field

    /**
     * create a point on the center of cartesian coord. system.
     */
    public Point() {
        this(0.0f, 0.0f);
        // this.x = 0.0F;
        // this.y = 0.0F;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
        // this.x = p.x;
        // this.y = p.y;
    }

    // getter and setter
    // accessor and modifier

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
        this.x += dX; // this.x = this.x + dX
        this.y += dY;
    }

    public float distance(Point p) {
        // TODO
        // calculate & return the distance between
        // Point object referred to by "p" and
        // Point object referred to by "this"

        return (float) Math.hypot((p.x - this.x), (p.y - this.y));
    }

    public boolean equals(Point p) {
        // TODO
        // if the x and y coordinates of the following objects
        // Point object referred to by "p"
        // Point object referred to by "this"
        // are equal resp. return true.
        // return false, otherwise

        // if (this.x == p.x && this.y == p.y)
        // return true;
        // else
        // return false;

        return this.x == p.x && this.y == p.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}