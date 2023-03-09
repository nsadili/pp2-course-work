public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
     @Override
     public String toString() {
       return String.format("Radius: %f, x-coordinate: %f , y-coordinate: %f",radius, x, y);
     }
    
     public boolean equals(Object c1) {
        Circle c = (Circle) c1;
         return this.radius == c.radius && this.x == c.x && this.y == c.y;
     }
    
}
