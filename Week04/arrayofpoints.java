import java.awt.Point;

public class arrayofpoints {
    
    public static Point getmostNorthern(Point[] points) {
        Point mostnorthern = points[0];
        for (Point p : points) {
            if (p.getY() > mostnorthern.getY()) {
                mostnorthern = p;
            }
        }
        return mostnorthern;
    }
    
    public static Point getmostSouthern(Point[] points) {
        Point mostsouthern = points[0];
        for (Point p : points) {
            if (p.getY() < mostsouthern.getY()) {
                mostsouthern = p;
            }
        }
        return mostsouthern;
    }
    
    public static Point getmostWestern(Point[] points) {
        Point mostwestern = points[0];
        for (Point p : points) {
            if (p.getX() < mostwestern.getX()) {
                mostwestern = p;
            }
        }
        return mostwestern;
    }
    
    public static Point getmostEastern(Point[] points) {
        Point mosteastern = points[0];
        for (Point p : points) {
            if (p.getX() > mosteastern.getX()) {
                mosteastern = p;
            }
        }
        return mosteastern;
    }
    
    public static void main(String[] args) {
       Point[] points = { new Point(2, 3), new Point(4, 1), new Point(6, 5),
                           new Point(7, 8), new Point(10, 9), new Point(11, 0) };
        
        Point mostnorthern = getmostNorthern(points);
        Point mostsouthern = getmostSouthern(points);
        Point mostwestern = getmostWestern(points);
        Point mosteastern = getmostEastern(points);
        
        System.out.println("mostNorthern point: " + mostnorthern);
        System.out.println("mostSouthern point: " + mostsouthern);
        System.out.println("mostWestern point: " + mostwestern);
        System.out.println("mostEastern point: " + mosteastern);
    }
}
