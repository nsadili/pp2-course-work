package Week06;


class Point {
    private float x;
    private float y;

    Point(){

    }

    Point (float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p){
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

    public void translate (float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance (Point p) {
        float dX = this.x - p.x;
        float dY = this.y - p.y;

        return (float) Math.sqrt(dX * dX + dY * dY);
    }

    boolean equals (Point p) {
        return this.x == p.x && this.y == p.y;
    }
}

class Segment {
    Point p1;
    Point p2;


    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void translate(float dx, float dy) {
        this.p1.translate(dx, dy); 
        this.p2.translate(dx, dy); 
    }

    public float length () {
        return this.p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope() {
        float dx = this.p2.getX() - this.p1.getX(); 
        float dy = this.p2.getY() - this.p1.getY();
        return dy / dx;
    }

    public float getIntersept() {
        float m = this.getSlope();
        return this.p1.getY() - m * this.p1.getX();
    }

    public boolean isOnLine(Point p) {
        float m = this.getSlope();
        float b = this.getIntersept();

        return p.getY() == m * p.getX() + b;
    }

    public boolean isOnSegment(Point p) {
        float minX = Math.min(this.p1.getX(), this.p2.getX());
        float maxX = Math.max(this.p1.getX(), this.p2.getX());
        float minY = Math.min(this.p1.getY(), this.p2.getY());
        float maxY = Math.max(this.p1.getY(), this.p2.getY());
        return this.isOnLine(p) && p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }
}



class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        //Rectangle rect = (Rectangle) obj;

        return true;
        
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
    }
}