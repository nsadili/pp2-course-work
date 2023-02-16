package pp2.week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        // this.p1=new Point(x1,y1);
        // this.p1=new Point(x2,y2);
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p1);
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public boolean equals(Segment s){
        if(s.p1==s.p2) return true;
        else return false;
    }

    public float GetSlope(){
        if (this.p1.getX() == this.p2.getX()) {
            throw new ArithmeticException("The line is vertical and the slope is undefined");
        }
        return (this.p2.getY()-this.p1.getY()) / (this.p2.getX()-this.p1.getX());
    }

    public float GetIntercept(){
        return this.p1.getX()- GetSlope()*this.p1.getY();
    }

    public boolean IsOnLine(Point p){
        if(p.getY()==GetSlope()*p.getX()+GetIntercept()) return true;
        else return false;
    }

    public boolean IsOnSegment(Point p){
        if((p.getX()>this.p1.getX()&&p.getY()>this.p1.getY()
        &&p.getX()<this.p2.getX()&&p.getY()<this.p2.getY())
        ||(p.getX()<this.p1.getX()&&p.getY()<this.p1.getY()
        &&p.getX()>this.p2.getX()&&p.getY()>this.p2.getY())) return true;
        else return false;
    }
}
