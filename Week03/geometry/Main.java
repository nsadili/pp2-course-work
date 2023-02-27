package Week03.geometry;
public class Main {
    public static void main(String[] args) {

        Point p1 =  new Point();
        Point p2 =  new Point(4, 5);        

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
        System.out.println("P1==P2 ? " + p1.equals(p2));
        p1.translate(2, 3);
        System.out.println("Point p1 is translated to: " + p1.getX() + ", " + p1.getY());
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println("Are p1 and p2 still equal? " + p1.equals(p2));


        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(1.0f, 2.0f, 3.0f, 4.0f);

        System.out.println("Segment 1: " + "( " + s1.getP1().getX() + ", " + s1.getP1().getY() + "; "
        + s1.getP2().getX() + ", " + s1.getP2().getY() + ")");

        System.out.println("Segment 2: " + "( " + s2.getP1().getX() + ", " + s2.getP1().getY() + "; "
        + s2.getP2().getX() + ", " + s2.getP2().getY() + ")");

        s1.translate(2, 3);
        System.out.println("Segment 1 is translated to: (" + s1.getP1().getX() + ", " + s1.getP1().getY()
        + "), (" + s1.getP1().getX() + ", " + s1.getP1().getY() + ")");

        System.out.println("Segment 1 length = " + s1.length());
        System.out.println("S1==S2 ? " + s1.equals(s2));
        System.out.println("Slope of segment s1: " + s1.getSlope());
        System.out.println("Intercept of segment s1: " + s1.getIntercept());
    }
}