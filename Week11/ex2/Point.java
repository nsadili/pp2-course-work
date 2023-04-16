package ex2;

public class Point {
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
        if(obj == null) return false;
        if(! (obj instanceof Point) ) return false; 
        Point that = (Point) obj; //downcasting
        return this.x == that.x && this.y == that.y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
   