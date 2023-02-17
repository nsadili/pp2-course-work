package pp2.week4;

public class Ex16 {

    public static void printExtremePoints(Point[] points) {
        Point north = points[0], south = points[0], west = points[0], east = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].y < north.y) {
                north = points[i];
            }
            if (points[i].y > south.y) {
                south = points[i];
            }
            if (points[i].x < west.x) {
                west = points[i];
            }
            if (points[i].x > east.x) {
                east = points[i];
            }
        }

        System.out.println("Most Northern point: " + north);
        System.out.println("Most Southern point: " + south);
        System.out.println("Most Western point: " + west);
        System.out.println("Most Eastern point: " + east);
    }

}
