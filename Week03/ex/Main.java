import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {

    public static void main(String[] args) {
        
        Point p1 = new Point();
        Point p2 = new Point(3,5);

        Segment s = new Segment(p1, p2);
        Segment s2 = new Segment(3,4,5,10);

        System.out.printf("p1 : (%f, %f) and p2 : (%f, %f)\n", s.getP1().getX(), s.getP1().getY(), s.getP2().getX(), s.getP2().getY());

        System.out.println(s.getSlope());

        System.out.println(p1.equals(p2));

    }
}
