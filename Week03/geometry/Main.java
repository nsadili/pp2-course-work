package pp2.week03.geometry;

public class Main {
    public static void main(String[] args) {
        
        
        Point p1 = new Point(2, 4);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.setX(3);

        Point p2 = new Point(1, 2);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println(p2.equals(p1));

        Segment s = new Segment(p1, p2);
        System.out.println(s.getP1());
        System.out.println(s.getP2());
        System.out.println(s.isOnLine(p2));
        System.out.println(s.getIntercept());
        System.out.println(s.getSlope());
    }
}
