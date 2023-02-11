import geometry.Point; 
import geometry.Segment; 
public class Main {
    public static void main (String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4,5);
        p1.translate(2, 3);
        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(0,0,3,4);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p2.getX());
        System.out.println(p2.getY()); 
        System.out.println(p1.distance(p2));
        System.out.println(p1.equals(p2));
        System.out.println(s1.getP1());
        System.out.println(s2.getP2());
        System.out.println(s1.getSlope());
        System.out.println(s1.getIntercept());
        System.out.println(s1.length());
        System.out.println(s2.isOnLine(p1));
    }
}
