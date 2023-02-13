import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(4, 5);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(0, 0, 3, 4);

        p1.translate(2, 3);

        System.out.println(p1.getX() + ", " + p1.getY()); // (Point.java)
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

        System.out.printf("p1: (%.2f, %.2f) and p2(%.2f, %.2f)\n",
                s1.getP1().getX(), s1.getP1().getY(),
                s2.getP2().getX(), s2.getP1().getY());
    }

}
