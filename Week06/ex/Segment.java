public class Segment implements Movable {
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
        if (obj == null || !(obj instanceof Segment)) return false;
        Segment s = (Segment)obj;
        return p1.equals(s.p1) && p2.equals(s.p2);
    }
    
    public String toString() {
        return "[ " + p1 + ", " + p2 + " ]";
    }
    
    @Override
    public void moveUp() {
        this.p1.moveUp();
        this.p2.moveUp();
    }

    @Override
    public void moveDown() {
        this.p1.moveDown();
        this.p2.moveDown();
    }

    @Override
    public void moveLeft() {
        this.p1.moveLeft();
        this.p2.moveLeft();
    }

    @Override
    public void moveRight() {
        this.p1.moveRight();
        this.p2.moveRight();
    }
}
