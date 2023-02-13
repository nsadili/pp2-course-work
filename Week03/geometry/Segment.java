package Week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment (float x1, float y1, float x2, float y2){
        this.p1.setX(x1);
        this.p2.setX(x2);
        this.p1.setY(y1);
        this.p2.setY(y2);
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

    public float length(){
        return p1.distance(p2);
    }

    public boolean equals(Segment s)
    {
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }


    public boolean isOnline(Point p) {
        if ((this.p1.getX() <= p.getX() && this.p2.getX() >= p.getX()) && (this.p1.getY() <= p.getY() && this.p2.getY()>= p.getY()))
            return true;

        return false;
    }
}
