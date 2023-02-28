
public class Point {
    private float x;
    private float y; 

    public Point() {
        this(0.0f, 0.0f);
        this.x = 0.0F;
        this.y = 0.0F;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
        this.x = p.x;
        this.y = p.y;
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
        return (float) Math.hypot((p.x - this.x), (p.y - this.y));
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}