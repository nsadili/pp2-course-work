package week03.geometry;

public class Segment
//segment is part of line here not circle's
{
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2)
    {
        this.p1 = new Point(X1, y1);
        this.p2 = new Point(X2, y2);
    }

    
}