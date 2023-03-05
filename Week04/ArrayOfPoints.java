public class ArrayOfPoints {
    public static void extremePoints(Point[] points) {
        Point n = points[0];
        Point s = points[0];
        Point w = points[0];
        Point e = points[0];
        for (int i = 1; i < points.length; i++) {
            Point p = points[i];
            if (p.y > n.y) {
                n = p;
            }
            if (p.y < s.y) {
                s = p;
            }
            if (p.x < w.x) {
                w = p;
            }
            if (p.x > e.x) {
                e = p;
            }
        }
        System.out.println("Northernmost point " + n.toString());
        System.out.println("Southernmost point " + s.toString());
        System.out.println("Westernmost point " + w.toString());
        System.out.println("Easternmost point " + e.toString());
    }
    
}
