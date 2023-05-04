public class Point {
    private int x;
    private int y;
  
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("(").append(this.x).append(", ").append(this.y).append(")");
      return sb.toString();
    }
  }

  public class Segment {
    private Point start;
    private Point end;
  
    public Segment(Point start, Point end) {
      this.start = start;
      this.end = end;
    }
  
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("[").append(this.start).append(", ").append(this.end).append("]");
      return sb.toString();
    }
  }
  