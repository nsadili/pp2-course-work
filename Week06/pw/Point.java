

public class Point {

    private float x;
    private float y;

    public Point() {
        // EMPTY DEFAULT) CONSTRUCTOR
        // this.x = 3;
        // this.y = 3;
        this(3, 3);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        //this as the current point
        //p as the incomping point
        float dist = (float) Math.sqrt(
        Math.pow(p.getX() - this.x, 2)
        +
        Math.pow(p.getY() - y, 2)
        );
        return dist;
    }
}