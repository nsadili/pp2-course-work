package ex10;



public class Segment {
    private Pointw3 p1;
    private Pointw3 p2;

    public Segment (Pointw3 p1, Pointw3 p2){
        this.p1=p1;
        this.p2=p2;
    }

    // override
    public String toString(){
        return "P1 point: " + p1.toString() + " P2 point: " + p2.toString();
    }

    public Pointw3 getP1() {
        return p1;
    }

    public void setP1 (Pointw3 p1) {
        this.p1 = p1;
    }

    public Pointw3 getP2() {
        return p2;
    }

    public void setP2 (Pointw3 p2) {
        this.p2 = p2;
    }

    public Segment(float x1,float y1,float x2,float y2){
        // this.p1=new Pointw3(x1,y1);
        // this.p2=new Pointw3(x2,y2);
        this(new Pointw3(x1,y1),new Pointw3(x2,y2));
    }

    public void translate(float dX,float dY){
        this.p1.translate(dX, dY);
        this.p2.translate(dX, dY);
    }
    
    public float length(){
        return this.p1.distance(p2);
    }

    public boolean equals(Segment s){
        return p1.equals(s.p1) && p2.equals(s.p2);
    }
    // overloading
    public boolean equals(Object o){
        Segment s=(Segment) o;

        return p1.equals(s.p1) && p2.equals(s.p2);

    }

    public float getSlope(){
        return (p2.getY()-p1.getY()) / (p2.getX()-p1.getX());
    }

    public float getIntercept(){
        return   (p1.getY()-(getSlope()*p1.getX()));
    }

    public boolean isOnLine  (Pointw3 p){
        
        return p.getY()== getSlope()*p.getX() + getIntercept();
     
    }

    public boolean isOnSegment( Pointw3 p){
        return (isOnLine(p) && (p.getX() >= p1.getX() && p.getX()<= p2.getX() && p.getY()>= p1.getY() && p.getY()<=p2.getY()));
    }


}
