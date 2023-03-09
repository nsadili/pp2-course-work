package EX1;

public class Segment implements Movable{
    private Point p1;
    private Point p2;

    public Segment (Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment (float a1, float b1, float a2, float b2)
    {
        this.p1 = new Point (a1, b1);
        this.p2 = new Point (a2, b2);
    }

    public Point getP1()
    {
        return p1;
    }

    public Point getP2()
    {
        return p2;
    }

    public void setP1(Point p1) 
    {
        this.p1 = p1;
    }

    public void setP2(Point p2) 
    {
        this.p2 = p2;
    }

    public String toString()
    {
        return "("+p1+", "+p2.toString()+")";
    }
}
