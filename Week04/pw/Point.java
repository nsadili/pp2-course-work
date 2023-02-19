public class Point {
    private int x;
    private int y;
  
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    public int getX() {
      return x;
    }
  
    public int getY() {
      return y;
    }
  
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("(").append(x).append(", ").append(y).append(")");
      return sb.toString();
    }
  }



  public class Segment {
    private Point startPoint;
    private Point endPoint;
  
    public Segment(Point startPoint, Point endPoint) {
      this.startPoint = startPoint;
      this.endPoint = endPoint;
    }
  
    public Segment(int x1, int y1, int x2, int y2) {
      startPoint = new Point(x1, y1);
      endPoint = new Point(x2, y2);
    }
  
    public Point getStartPoint() {
      return startPoint;
    }
  
    public Point getEndPoint() {
      return endPoint;
    }
  
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("[").append(startPoint.toString()).append(", ").append(endPoint.toString()).append("]");
      return sb.toString();
    }


    
  }
  public class Circle {
    private Point center;
    private double radius;
  
    public Circle(Point center, double radius) {
      this.center = center;
      this.radius = radius;
    }
  
    public Circle(int x, int y, double radius) {
      this(new Point(x, y), radius);
    }
  
    public Point getCenter() {
      return center;
    }
  
    public double getRadius() {
      return radius;
    }
  
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Circle at ").append(center.toString()).append(" with radius ").append(radius);
      return sb.toString();
    }
  }
      