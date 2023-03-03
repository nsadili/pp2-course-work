package geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2); 
    }

    public void translate(float dX, float dY){
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    public double length(){
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return "point 1: "+ p1.toString() + ", point 2: "+ p2.toString();
    }

    public boolean equals(Segment s){
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope(){
        return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
    }
    
    public float getIntercept(){
        return p1.getY()-(getSlope()*p1.getX());
    }

    public boolean isOnLine(Point p){
        return getSlope()*p.getX()+getIntercept()==p.getY(); 
    }

    public boolean isOnSegment(Point p){
        return  
        ((p.getX()>=p1.getX() && p.getX()<=p2.getX() && p.getY()>=p1.getY() && p.getY()<=p2.getY()) || 
        (p.getX()<=p1.getX() && p.getX()>=p2.getX() && p.getY()<=p1.getY() && p.getY()>=p2.getY())) && isOnLine(p);
    }

}
