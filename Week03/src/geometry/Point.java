package geometry;
public class Point {
    private double x;
    private double y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public boolean equals(Point p) {
        if(this.x == p.x && this.y == p.y) {
            return true;
        }
        return false;
    }
    public void translate(double dX, double dY) {
        this.x += dX;
        this.y += dY;
    }
    public double distance(Point p) {
        return Math.sqrt((p.x - this.x)*(p.x - this.x)+(p.y - this.y)*(p.y - this.y)); 
    }


    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y +")";
    }
}


