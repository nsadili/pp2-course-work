package ex1_5_6;

public class Circle extends Object {
    private int radius;
    private Point center;

    public Circle(int r, Point c) {
        radius = r;
        center = c;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    
    public String toString() {
        return "[radius=" + radius + ", center=" + center + "]";
    }

    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }
    public void moveLeft() {
        center.moveLeft();
    }
    public void moveRight() {
        center.moveRight();
    }
}
