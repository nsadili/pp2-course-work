public class ArraysOfPoints {
    public static void main(String[] args) {
        class Point {
            double x;
            double y;
        
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }
        
        class PointStats {
            Point north;
            Point south;
            Point west;
            Point east;
        
            PointStats() {
                north = null;
                south = null;
                west = null;
                east = null;
            }
        
            void update(Point p) {
                if (north == null || p.y > north.y) {
                    north = p;
                }
                if (south == null || p.y < south.y) {
                    south = p;
                }
                if (west == null || p.x < west.x) {
                    west = p;
                }
                if (east == null || p.x > east.x) {
                    east = p;
                }
            }
        }
        
        public class PointAnalyzer {
            public static void main(String[] args) {
                Point[] points = {
                    new Point(1.0, 2.0),
                    new Point(3.0, 4.0),
                    new Point(5.0, 6.0),
                    new Point(7.0, 8.0),
                    new Point(9.0, 10.0)
                };
        
                PointStats stats = new PointStats();
                for (Point p : points) {
                    stats.update(p);
                }
        
                System.out.println("North: " + stats.north.x + ", " + stats.north.y);
                System.out.println("South: " + stats.south.x + ", " + stats.south.y);
                System.out.println("West: " + stats.west.x + ", " + stats.west.y);
                System.out.println("East: " + stats.east.x + ", " + stats.east.y);
            }
        }
        
    }
}
