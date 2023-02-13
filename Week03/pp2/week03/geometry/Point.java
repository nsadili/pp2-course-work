package pp2.week03.geometry;

public class Point {

    private float x;
    private float y;

    public Point() {
        // EMPTY (Default) Constructor
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
        float dist = (float) Math.sqrt(Math.pow(this.x - p.x, 2)
                +
                Math.pow(this.y - p.y, 2));

        dist = (float) Math.hypot(Math.pow(this.x - p.x, 2), Math.pow(this.y - p.y, 2));

        return dist;

    }
}