package Week06;

public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2,5);
        Point p2 = new Point(5,7);

        Segment s1 = new Segment(p1, p2);

        Segment s2 = new Segment(2,3,5,7);



        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));

        // System.out.println(p1==p2);
        // System.out.println(p1.equals("A string"));
        // System.out.println(p1.equals(new Point(5,7)));
    }
}
