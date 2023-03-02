public static void findExtremePoints(Point[] points) {
    Point northernmost = points[0];
    Point southernmost = points[0];
    Point westernmost = points[0];
    Point easternmost = points[0];

    for (int i = 1; i < points.length; i++) {
        if (points[i].y > northernmost.y) {
            northernmost = points[i];
        }
        if (points[i].y < southernmost.y) {
            southernmost = points[i];
        }
        if (points[i].x < westernmost.x) {
            westernmost = points[i];
        }
        if (points[i].x > easternmost.x) {
            easternmost = points[i];
        }
    }

    System.out.println("Northernmost point: " + northernmost);
    System.out.println("Southernmost point: " + southernmost);
    System.out.println("Westernmost point: " + westernmost);
    System.out.println("Easternmost point: " + easternmost);
}
