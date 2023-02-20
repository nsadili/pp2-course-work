package ArraysOfObjects.ex17;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x; this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }
    public void setY(double x) {
        this.y = y;
    }

    public double distance(Point p) {
        double d = (double) Math.sqrt( Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2) );
        return d;
    }
}
