package Week06.Ex01;


public class OverSegment {
    private Point start;
    private Point end;
  
    public OverSegment(Point start, Point end) {
      this.start = start;
      this.end = end;
    }
  
    public Point getStart() {
      return start;
    }
  
    public Point getEnd() {
      return end;
    }
  
    @Override
    public String toString() {
      return "Segment(" + start.toString() + ", " + end.toString() + ")";
    }
  
    @Override
    public boolean equals(Object obj) {
    if (obj instanceof Segment) {
        Segment other = (Segment) obj;
        return this.start.equals(other.getP1()) && this.end.equals(other.getP2());
    }
    return false;
  }

}

