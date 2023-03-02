import java.awt.Point;

public class PointAnalyzer {

    public static void main(String[] args) {

        Point[] points = { new Point(2, 5), new Point(7, 3), new Point(4, 1), new Point(1, 4), new Point(6, 6) };

        Point mostNorthern = points[0];
        Point mostSouthern = points[0];
        Point mostWestern = points[0];
        Point mostEastern = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getY() > mostNorthern.getY()) {
                mostNorthern = points[i];
            }
            if (points[i].getY() < mostSouthern.getY()) {
                mostSouthern = points[i];
            }
            if (points[i].getX() < mostWestern.getX()) {
                mostWestern = points[i];
            }
            if (points[i].getX() > mostEastern.getX()) {
                mostEastern = points[i];
            }
        }

        System.out.println("Most Northern Point: " + mostNorthern.toString());
        System.out.println("Most Southern Point: " + mostSouthern.toString());
        System.out.println("Most Western Point: " + mostWestern.toString());
        System.out.println("Most Eastern Point: " + mostEastern.toString());
    }
}
