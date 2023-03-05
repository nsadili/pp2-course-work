public class Circle implements Movable {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }



    public void setCenter(Point center) {
        this.center = center;
    }



    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        this.radius = radius;
    }



    @Override
    public Movable moveUp(int steps) {
        center.setY(center.getY()+steps);
        return this;
    }

    @Override
    public Movable moveDown(int steps) {
        center.setY(center.getY()-steps);
        return this;
     }

    @Override
    public Movable moveLeft(int steps) {
        center.setX(center.getX()-steps);
        return this;
    }

    @Override
    public Movable moveRight(int steps) {
        center.setX(center.getX()+steps);
        return this;
    }

    @Override
    public String toString() {
        return "(Center: " + center + ", radius: " + radius + ")";
    }


}
