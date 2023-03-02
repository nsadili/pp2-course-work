public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        if (!(obj instanceof Point)) {
            return false;
        }
        
        Point other = (Point) obj;
        return Double.compare(x, other.getX()) == 0 && Double.compare(y, other.getY()) == 0;
    }
}

public class Circle {
    private Point center;
    private double radius;
    
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public Point getCenter() {
        return center;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setCenter(Point center) {
        this.center = center;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String toString() {
        return "Circle[center=" + center.toString() + ", radius=" + radius + "]";
    }
    
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        if (!(obj instanceof Circle)) {
            return false;
        }
        
        Circle other = (Circle) obj;
        return center.equals(other.getCenter()) && Double.compare(radius, other.getRadius()) == 0;
    }
}
