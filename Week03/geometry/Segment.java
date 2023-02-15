package Week03.geometry;

public class Segment {
    private Point p1;
    private Point p2;


    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Segment(float a1, float b1, float a2, float b2) {
        this(new Point(a1, b1), new Point(a2, b2));
    }


    public Point getP1() {
        return this.p1;
    }

    
    public Point getP2() {
        return this.p2;
    }


    public void setP1(Point p1) {
        this.p1 =p1;
    }


    public void setP2(Point p2) {
        this.p2 = p2;
    }


    public void translate(float dA, float dB) 
    {
        this.p1.translate(dA, dB);
        this.p2.translate(dA, dB);
    }


    public float length() 
    {
        return p1.distance(p2);
    }


    public boolean equals(Segment t) 
    {
        return p1.equals(t.p1) && p2.equals(t.p2);
    }


    public float getSlope() {
        return (p1.getB() - p2.getB()) / (p1.getA() - p2.getA());
    }


    public float getIntercept() {
        float slope = getSlope();

        return p1.getB() - slope * p1.getA();
    }


    public boolean isOnLine(Point p) {
        return p.getA() == (getSlope() * p.getA() + getIntercept());
    } 
}
