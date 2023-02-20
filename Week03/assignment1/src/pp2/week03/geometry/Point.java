package pp2.week03.geometry;

public class Point {

    private float x;
    private float y;

    public Point() {
        // EMPTY (DEFAULT) CONSTRUCTOR
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
}
