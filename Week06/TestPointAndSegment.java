public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);

        Point p2 = new Point (2, 5);
        /*System.out.println(p1);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals("Alibaba"));*/
        Segment s1=new Segment (p1, p2);
        Segment s2=new Segment(2, 5, 5, 10);
        System.out.println(s1);
        System.out.println(s1.equals(s2));

        /*System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));*/

    }
}