public class Points {
    public static void main(String[] args) {

        Point[] pts = new Point[] { new Point(), //
                new Point(3, 4), //
                new Point(-3, 5), //
                new Point(-2, -1), //
                new Point(-5, 0) };

        // I will assume that there is at least one point
        Point west, east, north, south;

        west = east = north = south = pts[0];

        for (int i = 1; i < pts.length; i++) {
            if (pts[i].getX() < west.getX())
                west = pts[i];
            if (pts[i].getX() > east.getX())
                east = pts[i];

            if (pts[i].getY() > north.getY())
                north = pts[i];
            if (pts[i].getY() < south.getY())
                south = pts[i];
        }

        System.out.println("West: " + west);
        System.out.println("East: " + east);
        System.out.println("North: " + north);
        System.out.println("South: " + south);
    }
}
