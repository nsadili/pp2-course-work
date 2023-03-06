public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public boolean equals(Object obj) {
      Segment sg = (Segment) obj;
      if(sg.p1 == this.p1 && sg.p2 == this.p2){
          return true;
      }else{
          return false;
      }
    }

    public String toString() {

        return "Point p1 = " + this.p1 + " Point p2 = " + this.p2;
    }
}