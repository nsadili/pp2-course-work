import week03.geometry.Point;
import week03.geometry.Segment;

public class Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point();

        Point p2 = new Point(4, 5);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(0,0, 3,4);

        System.out.printf(
            "p1 : ( %.2f, %.2f) and p2 : (%.2f, %.2f)\n",)

        // p1.translate(2,3);

        // System.out.println(p1.getX() + "," + p1.getY());
        // System.out.println(p2.getX() + "," + p2.getY());
        
        // System.out.println(p1.distance(p2));
        // System.out.println(p2.distance(p1));
    }
}