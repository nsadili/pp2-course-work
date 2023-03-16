public class ArrayOfPoints {
    public static void extremePoints(Point[] points) {
        Point n = points[0];
        Point s = points[0];
        Point w = points[0];
        Point e = points[0];

        for (int i = 1; i < points.length; i++) {
            Point p = points[i];
            if (p.getY() > n.getY()) {
                n = p;
            }
            if (p.getY() < s.getY()) {
                s = p;
            }
            if (p.getX() < w.getX()) {
                w = p;
            }
            if (p.getX() > e.getX()) {
                e = p;
            }
        }
        System.out.println("Northernmost point " + n.toString());
        System.out.println("Southernmost point " + s.toString());
        System.out.println("Westernmost point " + w.toString());
        System.out.println("Easternmost point " + e.toString());
    }
    
}
