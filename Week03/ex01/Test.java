package ex01;
import ex01.objects.Point;
import ex01.objects.Segment;
public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);
        Point p2 = new Point(3,5);
        Segment s = new Segment(p1, p2);
        System.out.printf("p1: (%f, %f), p2: (%f, %f)\n",
        s.getP1().getx(), s.getP1().gety(), s.getP2().getx(), s.getP2().gety()
        );
        // p1.translate(1, 1);
        // System.out.println(p1.getx() + ", " + p1.gety());
        // System.out.println(p2.getx() + ", " + p2.gety());
        // System.out.println(p1.distance(p2));
    }
}