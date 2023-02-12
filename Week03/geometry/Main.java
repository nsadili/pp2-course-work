package Week03.geometry;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(9, 12);
        Segment s = new Segment(p1, p2);

        System.out.println("P1 is: (" + p1.getX() + "; " + p1.getY() + ").");
        System.out.println("P2 is: (" + p2.getX() + "; " + p2.getY() + ").");
        System.out.println("P1 equals P2: " + p1.equals(p2));
        System.out.println("Distance between P1 and P2 is: " + p1.distance(p2));
        System.out.println("The segment is on line with P1: " + s.isOnLine(p1));
        System.out.println("The segment is on line with P2: " + s.isOnLine(p2));
        System.out.println("The intercept of segment is: " + s.getIntercept());
        System.out.println("The slope of the segment: " + s.getSlope());
    }
}
