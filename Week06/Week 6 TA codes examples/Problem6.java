interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Circle extends Shape implements Movable, Resizable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                super.toString() +
                ", radius=" + radius +
                ']';
    }

    // Shape class methods to override

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Movable interface methods to implement
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    // Resizable interface methods to implement

    @Override
    public void resize() {
        radius = 1.0;
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Movable[] movable = {new Point(1,1), new Segment(1,1,2,2), new Circle(new Point(1,1),3)};
        System.out.println("All the way up:");
        System.out.println();
        for(int i = 0; i < movable.length; i++) {
            System.out.println("Before:");
            System.out.println(movable[i]);
            movable[i].moveUp();
            System.out.println("After:");
            System.out.println(movable[i]);

            System.out.println();
        }
    }
}
