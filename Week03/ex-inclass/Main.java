import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {

   public static void main(String[] args) {
        
    float x = Float.parseFloat(args[0]);
    float y = Float.parseFloat(args[1]);

    Point p1 = new Point(2.0f, 3.0f);
    Point p2 = new Point(x, y);


    System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
    System.out.println("Are Point 1 and Point 2 equal? " + p1.equals(p2));

    p1.translate(1.0f, 1.0f);

    System.out.println("Translated Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
    System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
    System.out.println("Are Point 1 and Point 2 equal after p1 was translated? " + p1.equals(p2));

    Segment s1 = new Segment(p1, p2);
    Segment s2 = new Segment(1.0f, 2.0f, 3.0f, 4.0f);

    System.out.println("Segment 1: (" + s1.getP1().getX() + ", " + s1.getP1().getY() + ") (" + s1.getP2().getX() + ", " + s1.getP2().getY() + ")");
    
    System.out.println("Segment 2: (" + s2.getP1().getX() + ", " + s2.getP1().getY() + ") (" + s2.getP2().getX() + ", " +s2.getP2().getY() + ")");

    s1.translate(1.0f, 1.0f);

    System.out.println("Translated Segment 1: (" + s1.getP1().getX() + ", " + s1.getP1().getY() + ") (" + s1.getP2().getX() + ", " + s1.getP2().getY() + ")");
    System.out.println("Length of Segment 1: " + s1.length());
    System.out.println("Are Segment 1 and Segment 2 equal? " + s1.equals(s2));
    System.out.println("Slope of Segment 1: " + s1.getSlope());
    System.out.println("Interceptg of Segment 1: " + s1.getIntercept());

    Point p3 = new Point(2.0f, 3.0f);

    System.out.println("Is Point 3 on the line of Segment 1? " + s1.isOnLine(p3));
    System.out.println("Is Point 3 on Segment 1? " + s1.isOnSegment(p3));

    /* 
    
    p1.translate(2, -1);
    p2.translate(5, 2);

    System.out.println(p1.getX() + ", " + p1.getY());
    System.out.println(p2.getX() + ", " + p2.getY());

    System.out.println(p1.distance(p2));
    System.out.println(p2.distance(p1));

    System.out.println(p1.equals(p2));
    System.out.println(p2.equals(p1));
    
    
    System.out.printf("p1: (%2f, %2f) and p2: (%2f %2f)\n",
        s.getP1().getX(), s.getP1().getY(), 
        s.getP2().getX(), s.getP2().getY());

    */

    //System.out.println(p1.SetX(3), p2.SetX(3));

    }
}
