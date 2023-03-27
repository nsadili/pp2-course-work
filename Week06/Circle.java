public class Circle implements Movable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
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

   
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
}