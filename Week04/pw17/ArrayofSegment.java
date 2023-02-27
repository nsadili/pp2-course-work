package Week04.pw17;
import Week04.pw16.Point;
import java.util.Scanner;

public class ArrayofSegment {
    
    public static class Segment {
        
        private Point p1;
        private Point p2;

        public Segment() {
            this(new Point (0, 0), new Point (0, 0));
        }

        public Segment(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
    
        public Segment(double x1, double y1, double x2, double y2) {
            this(new Point (x1, y1), new Point (x2, y2));
        }
    
        public void translate (double dx, double dy) {
            this.p1.translate(dx, dy);
            this.p2.translate(dx, dy);
        }
    
        public double length (Point p1, Point p2) {
            return (double) Math.abs(Math.sqrt(p1.getX() - p2.getX())) + (double) Math.abs(Math.sqrt(p1.getY() - p2.getY()));
        }
    
        public double getSlope () {
            return (p1.getX() - p2.getX()) / (p1.getY() - p2.getY());
        }
    
        public double getIntercept () {
            return p1.getY() - getSlope() * p1.getX();
        }
    
        public boolean isOnLine (Point p) {
            return getSlope()*p.getX() - getIntercept() == p.getY() ? true : false;
        }
    
        public Point getP1() {
            return p1;
        }
    
        public Point getP2() {
            return p2;
        }
    
    }

    public static String minLen(Segment[] segments){
        double minLen = segments[0].length(segments[0].p1, segments[0].p2);
        Segment minSeg = new Segment(segments[0].p1, segments[0].p2);
        for (int i = 0; i < segments.length; i++){
            double currentLen = segments[i].length(segments[i].p1, segments[i].p1);
            if (minLen > currentLen) minSeg = segments[i];
        }
        return String.format("[(%.0f, %.0f), (%.0f, %.0f)]", minSeg.p1.getX(), minSeg.p1.getX(), minSeg.p2.getX(), minSeg.p2.getX());
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Amount of segments: ");
        int n = scan.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++){
            System.out.printf("%d) Segment(x1, y1) (x2, y2): ", i + 1);
            segments[i] = new Segment(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        System.out.printf("\nSegment with minimum length: %s\n\n", minLen(segments));
        scan.close();
    }
}

