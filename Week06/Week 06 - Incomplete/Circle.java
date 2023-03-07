public class Circle implements Moveable{
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp(int n) {
        this.center.moveUp(n);
    }

    @Override
    public void moveDown(int n) {
        this.center.moveDown(n);

    }

    @Override
    public void moveLeft(int n) {
        this.center.moveLeft(n);

    }

    @Override
    public void moveRight(int n) {
        this.center.moveRight(n);

    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "["+ center+", "+radius+"]";
    }

    
}

