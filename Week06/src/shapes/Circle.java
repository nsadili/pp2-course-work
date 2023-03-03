package shapes;

public abstract class Circle extends Shape implements Resizable{
    protected double radius = 1.0;


    public void resize(double r) {
        setRadius(r);
    }

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[ "+  super.toString() + ", radius=" + radius + " ]";
    }
    
}
