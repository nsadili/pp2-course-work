package Week02;

public class Segment {
    private Point a;
    private Point b;
    public Segment () {}

    public Segment (Point a, Point b ) {
        this.a = a;
        this.b = b;
    }
    public Segment (Segment s1Segment ) {

        this(s1Segment.a, s1Segment.b);
    }

    public Point getX() {

        return a;
    }

    public void setX(Point a ) {

        this.a= a;
    }

    public Point getY() {

        return b;
    }

    public void setY(Point y ) {

        this.b = b;
    }

}
