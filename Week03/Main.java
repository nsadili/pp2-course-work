import EXWeek03.Point;
import EXWeek03.Segment;
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4, 5);
        //p1.translate(2, 3);
        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
        Segment s1=new Segment(p1, p2);
        Segment s2=new Segment(4, 5,10, 10);
        // System.out.printf(
        // "p1:(%.2f, %.2f) and p2:(%.2f, %.2f)\n", s1.getP1().getX(), s1.getP1().getY(), s1.getP2().getX(), s1.getP2().getY());
        // s1.translate(4, 5);
        // System.out.printf(
        // "p1:(%.2f, %.2f) and p2:(%.2f, %.2f)\n", s1.getP1().getX(), s1.getP1().getY(), s1.getP2().getX(), s1.getP2().getY());
        // System.out.println(p1.equals(p2));
        System.out.println(s1.equals(s2));


    }

}
