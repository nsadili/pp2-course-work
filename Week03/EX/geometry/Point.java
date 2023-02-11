package EX.geometry;

public class Point {
    
    private float x;
    private float y;
    
    public Point() {
       this(3, 4);
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

    public void translate(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public float distance(Point p) {
        return (float) Math.sqrt(Math.pow(p.getX() - this.x, 2) +
                                Math.pow(p.getY() - this.y, 2));
    }

}
