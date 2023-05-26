package week04.geometry;

public class Point {

   

    private double x;
    private double y; // field

    public Point() {
        // empty constructor(DEFAULT) their name is the same with class
        // this.x = 10;
        // this.y= 10;
        this(10, 10);
    }

    public Point(double x1, double y1) {
        this.x = x1;
        this.y = y1;

    }

    public double getX() {
        return this.x; // == return x;
    }

    public double getY() {
        return y;
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

    public boolean equals(Point p) {

        if (this.x == p.x)
            return true;
        else
            return false;

    }
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
   
    }