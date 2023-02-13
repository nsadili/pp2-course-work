package pp2.week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;
    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point (x1, y1);
        this.p2 = new Point (x2, y2);
      }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public void translate(float dX, float dY){
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }
    public float length(){
        return p1.distance(p2);
    }
    public float getSlope(){
        float dx = this.p2.getX() - this.p1.getX();
        float dy = this.p2.getY() - this.p1.getY();
        float f = dy/dx;
        return f;
    }
    public float getIntercept(){
        float m = this.getSlope();
        return this.p1.getY() - m*this.p1.getX();
    }
    public boolean inOnLine(Point p){
        float m = this.getSlope();
        float b =this.getIntercept();
        return p.getY() == m*p.getX() + b; 
    }
    public boolean isOnSegment(Point p){
        float minX = Math.min(this.p1.getX(), this.p2.getX());
        float maxX = Math.max(this.p1.getX(), this.p2.getX());
        float minY = Math.min(this.p1.getY(), this.p2.getY());
        float maxY = Math.max(this.p1.getY(), this.p2.getY());
        return this.inOnLine(p) && p.getX() >= minX && p.getX() <=maxX && p.getY() >= minY && p.getY() <= maxY;
    }
    
}
