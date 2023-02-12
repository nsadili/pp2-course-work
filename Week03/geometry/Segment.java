package pp2.week03.geometry;

public class Segment {
    Point pt = new Point();
    private Point p1;
    private Point p2;

    //Constructor
    Segment(Point p1, Point p2){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    Segment(Segment s) {
        this.p1 = new Point(s.p1);
        this.p2 = new Point(s.p2);
    }


    //Getters and Setters
    public Point getPt() {
        return this.pt;
    }

    public void setPt(Point pt) {
        this.pt = pt;
    }

    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }


    //Methods
    public void translate(Point dX, Point dY){
        setP1(dX);
        setP2(dY);
    }

    public boolean equals(Segment p){
        return (this.p1 == p.p1 && this.p2 == p.p2);
    }

    public float length() {
        return p1.distance(p2);
    }

    public float getSlope() {
        float difY= p1.getY() - p2.getY();
        float difX = p1.getX() - p2.getX();
 
        if (difX == 0) {
            System.out.println("No slope! Vertical line");
            return Float.POSITIVE_INFINITY;
        }
        return difY / difX;
 
    }

    public float getIntercept() {
        float slopeOfFunc;
        if (this.getSlope() == Float.POSITIVE_INFINITY) {
            return Float.POSITIVE_INFINITY;
        }
        slopeOfFunc = this.getSlope();
 
        return this.p1.getY() - this.p1.getX() * slopeOfFunc;
    }

    public boolean isOnline(Point p) {
 
        return p.getY() == p.getX() * this.getSlope() + this.getIntercept();
 
    }
 
    public boolean isOnSegment(Point p) {
 
        if (!isOnline(p))
            return false;
 
        if (p.getX() >= this.p1.getX() && p.getX() >= this.p2.getX() ||
                p.getX() <= this.p1.getX() && p.getX() <= this.p2.getX())
            return false;
 
        if (p.getY() >= this.p1.getY() && p.getY() >= this.p2.getY() ||
                p.getY() <= this.p1.getY() && p.getY() <= this.p2.getY())
            return false;
 
        return true;
 
    }


    
}
