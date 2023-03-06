public class PointAndSegmentTest {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = p1.clone();
        System.out.println("p1: " + p1.getX() + ", " + p1.getY());
        System.out.println("p2: " + p2.getX() + ", " + p2.getY());
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        
        Segment s1 = new Segment(1, 1, 4, 5);
        Segment s2 = s1.clone();
        System.out.println("s1.p1: " + s1.getP1().getX() + ", " + s1.getP1().getY());
        System.out.println("s1.p2: " + s1.getP2().getX() + ", " + s1.getP2().getY());
        System.out.println("s2.p1: " + s2.getP1().getX() + ", " + s2.getP1().getY());
        System.out.println("s2.p2: " + s2.getP2().getX() + ", " + s2.getP2().getY());
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}
