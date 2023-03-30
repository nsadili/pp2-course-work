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
    public String toString() {
        return "(" + this.center.toString() + ", " + this.radius + ")";
    }
    
    // Interface methods
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
  