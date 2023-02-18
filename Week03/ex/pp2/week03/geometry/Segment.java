package pp2.week03.geometry;
public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2){
        //  this.p1 = new Point(x1,y1);
        //  this.p2 = new Point(x2,y2);
         this(new Point(x1,y1), new Point(x2,y2));

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    public float getSlope(){
        return (this.getP1().getY() - this.getP2().getY()) / (this.getP1().getX() - getP2().getX());
    }

    public float getIntercpet(){
        return this.getP1().getY() - this.getP1().getX() * getSlope();
    }

    public void translate(float dX, float dY){
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length(){
        return p1.distance(p1);
    }
    public boolean isOnLine(Point p){
        return p.getY() == p.getX() * this.getSlope() + this.getIntercpet();
    }

    public boolean isOnSegment(Point p){
        return isOnLine(p) && p.getX() >= this.getP1().getX() && p.getX() <= this.getP2().getX();
    }
}
