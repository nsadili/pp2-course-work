public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x-coordinate: %f , y-coordinate: %f", x,y);
    }

    
    public boolean equals (Object p1) {
        Point p = (Point) p1;
        return this.x == p.getX()  && this.y == p.getY() ;
    }
}
