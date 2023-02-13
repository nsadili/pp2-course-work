import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;
public class Main {

    public static void main (String [] args)
    {
        Point p1 = new Point();

        Point p2 = new Point(4, 5);
        p1.translate(2, 3);

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        // p1.distance(p2);
        Segment s1 = new Segment(p1, p2);
        Segment s2= new Segment(0, 0,  3,  4);
        System.out.printf("p1: (%.2f, %.2f) and p2: (%.2f, %.2f)\n",
        s2.getP1().getX(), s2.getP1().getY(),
        s2.getP2().getX(), s2.getP2().getX());
        s2.translate(1, 1);
        System.out.println("Translated by 1:");
        System.out.printf("p1: (%.2f, %.2f) and p2: (%.2f, %.2f)\n",
        s2.getP1().getX(), s2.getP1().getY(),
        s2.getP2().getX(), s2.getP2().getX());
        System.out.println("are these points equal: "+ p1.equals(p2));

        System.out.println("The distance: "+ p1.distance(p2));
        Point p3 = new Point(2, 3);
        System.out.println("Is Point 3 on the line of Segment 1? " + s1.inOnLine(p3));
        System.out.println("Is Point 3 on Segment 1? " + s1.isOnSegment(p3));

    }
    
}
