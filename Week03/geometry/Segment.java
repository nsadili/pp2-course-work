package Week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment (Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Segment (float x1, float y1, float x2, float y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }
    public Point getP1(){
        return this.p1;
    }
    public void setP1(Point p){
        this.p1 = p;
    }
    public Point getP2() {
        this.p2 = p;
    }
    public void setP2(Point p){
        this.p2 = p;
    }
    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }
    public float lenght(){
        return p1.distance(p2);
    }
    public boolean equals( Segment s) {
        return p1.equals(s.p1)&& p2.equals(s.p2);
    }
    public float getSlope(){
        return (p2.getY() - p1.getY())/(p2.getX()- p1.getY());
    }
    public float getIntercept(){
        return p1.getY() - getSlope() * p1.getX();
    }
    public boolean isOnline(Point p){
        return p.getY() == (getSlope() * p.getX() + getIntercept());
    }

}
