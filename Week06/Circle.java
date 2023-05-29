public class Circle extends Shape implements Movable, Resizable{
    private Point center;
    protected double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius){
    }

    public Circle(double radius, String color, boolean filled){
    }

    public Circle(Point center, double radius){
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
    public double getArea() {
        return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString(){
        return "Circle[Shape[coloe=" + color 
        + ", filled=" + filled+ "]" 
        + ", radius=" + radius + "]";
    }

    @Override
    public Resizable resize() {
        this.radius *= 1.5;
        return this;   
    }

    
}