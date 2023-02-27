package ex10;



public class MainPointSegment {
    public static void main(String[] args) {

        Pointw3 p1 = new Pointw3();

        Pointw3 p2 = new Pointw3(5, 10);

        Segment s = new Segment(p1, p2);

        Segment s2 = new Segment(1, 2, 5, 13);

        System.out.println(s.toString());
        System.out.println(p2.toString());

        // System.out.println(s.getSlope());

        // System.out.println(s.equals(s2));

        // System.out.printf(

        // "p1: %.02f %.02f , p2: %.02f
        // %.02f\n",s.getP1().getX(),s.getP1().getY(),s.getP2().getX(),s.getP2().getY()

        // );

        // System.out.println(p1.equals(p2));

        // System.out.println("y= " + s2.getSlope() +"x + "+s2.getIntercept());

        // System.out.println(s2.isOnLine(new Pointw3(1f, 3f)));

        // System.out.println(s.isOnSegment(p2));

    }
}
