class Circle {
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
        return "Circle(" + center.toString() + ", " + radius + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return center.equals(other.center) && radius == other.radius;
        }
        return false;
    }
}