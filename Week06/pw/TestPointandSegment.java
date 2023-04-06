public class TestPointandSegment {
    public static void main(String[] args) {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(5, 7);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(2, 5, 5, 10);

        System.out.println(p1);

        System.out.println(p1 == p2);

        System.out.println(p1.equals(p2));

        System.out.println(p1.equals("Alibaba"));

        System.out.println(s1);
        System.out.println(s1.equals(s2));


        p1.moveUp(5).moveRight(3);
        System.out.println(p1);
    }
}