package Week03.GeometryEx;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(), p2 = new Point(3.4f, 1.1f), p3 = new Point(p2);
        System.out.printf(
            "p1: ( %.2f, %.2f )\np2: ( %.2f, %.2f )\np3: ( %.2f, %.2f )\n",
            p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
        Point p4 = new Point(5.1f, 7.8f);
        System.out.println(p2.equals(p3));
        System.out.println(p3.distance(p4));
        Segment s1 = new Segment(p3, p4);
        Segment s2 = new Segment(2.9f, 0.2f, 7.3f, 10.9f);
        System.out.println(s1.getSlope());
        System.out.println(s1.getIntercept());
        System.out.println(s1.length());
        System.out.println(s2.isOnLine(p1));
        System.out.println(s1.isOnSegment(p4));
        System.out.printf("( %.2f, %.2f ) - ( %.2f, %.2f )\n", s2.getP1().getX(), s2.getP1().getY(), s2.getP2().getX(), s2.getP2().getY());
        s2.translate(7.1f, 0.1f);
        System.out.printf("( %.2f, %.2f ) - ( %.2f, %.2f )\n", s2.getP1().getX(), s2.getP1().getY(), s2.getP2().getX(), s2.getP2().getY());
    }
}
