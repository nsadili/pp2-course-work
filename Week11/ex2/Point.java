package ex2;


public class Point {
    private float x;
    private float y;

    public Point() {
        this(0, 0); 
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // copy constructor
    public Point(Point p) {
        this(p.getX(), p.getY());
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

   
   
}