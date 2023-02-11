import java.util.Scanner;

// package Week03.geometry;

public class Main {

    public static void main(String[] args) {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);

        Point p1 = new Point(2.0f, 3.0f);
        Point p2 = new Point(x, y);

        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");

        p1.translate(1.0f, 1.0f);

        System.out.println("Translated point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Distance between point 1 and point 2: " + p1.distance(p2));
        System.out.println("Are point 1 and point2 equal after point 1 was translated? " + p1.equals(p2));

        // Segment class testing

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(1.0f, 2.0f, 3.0f, 4.0f);

        System.out.println("Segment 1: (" + s1.getP1().getX() + ", " + s1.getP1().getY() + "), (" + s1.getP2().getX() + ", " + s1.getP2().getY() + ")");
        System.out.println("Segment 2: (" + s2.getP1().getX() + ", " + s2.getP1().getY() + "), (" + s2.getP2().getX() + ", " + s2.getP2().getY() + ")");

        s1.translate(1.0f, 1.0f);

        System.out.println("Translated Segment 1: (" + s1.getP1().getX() + ", " + s1.getP1().getY() + "), (" + s1.getP2().getX() + ", " + s1.getP2().getY() + ")");

        System.out.println("Length of Segment 1: " + s1.length());
        System.out.println("Are Segment 1 and Segment 2 equal? " + s1.equals(s2));
        System.out.println("Slope of Segment 1: " + s1.getSlope());
        System.out.println("Intercept of Segment 1: " + s1.getIntercept());
        Point p3 = new Point(2.0f, 3.0f);
        System.out.println("Is Point 3 on the line of Segment 1? " + s1.isOnLine(p3));
        System.out.println("Is Point 3 on Segment 1? " + s1.isOnSegment(p3));
    }
}
