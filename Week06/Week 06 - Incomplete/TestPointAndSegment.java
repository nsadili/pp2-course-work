public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);
        Point p3 = new Point(10, 13);

        Point p2 = (Point) p1.clone();

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Segment s1 = new Segment(p1, p3);
        Segment s2 = (Segment) s1.clone();
        
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.getP1()==s2.getP1());

    }
}
