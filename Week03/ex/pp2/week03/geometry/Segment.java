package pp2.week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);

    }

    public Point getP1() {
        return p1;
    }
    public void setP1(){
        this.p2 =p1;
    }

    public Point getP2() {
        return p2;
    }
    public void setP2(Point p2){
        this.p1 =p2;
    }

    public void translate(float dX, float dY) {
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }
public boolean equals(Segment s){
    //checks if seg1 == seg2
    if (p1==s.p1 && p2==s.p2) return true;
 else return false;
}

public float getSlope(){

}

public float getIntercept(){

}

public boolean isOnLine(Point p){

}

public boolean isOnSegment(Point p){
    
}

}
