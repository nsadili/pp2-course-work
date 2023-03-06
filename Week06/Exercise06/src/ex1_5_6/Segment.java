package ex1_5_6;

public class Segment extends Object implements Movable {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1=new Point(x1,y1);
        this.p2=new Point(x2,y2);
    }

    public Point getP1 () {
        return p1;
    }
    public Point getP2 () {
        return p2;
    }
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean isOnLine(Point p) {
        if ( (this.p1.getX() <= p.getX() && this.p2.getX() >= p.getX()) && (this.p1.getY() <= p.getY() && this.p2.getY() >= p.getY()) )
            return true;

        return false;
    }
    
    public boolean equals(Object obj) {
        Segment s = (Segment) obj;
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public String toString() {
        return "[(" + p1.getX() + ", " + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]";
    }

    protected Object clone() {
        return new Segment(p1.clone(), p2.clone());
    }

    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }
    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }
    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }
    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }
}
