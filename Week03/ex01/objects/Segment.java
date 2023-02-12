package ex01.objects;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public float distance(Point p1){
        return 1L;
    }
}
