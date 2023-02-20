package EX;
import java.util.Scanner;

public class pw17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many segments do you want? ");
        int n = scan.nextInt();
        System.out.println();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            segments[i] = new Segment(new Point(0, 0), new Point(0, 0));
         }
        for (int i = 0; i < n; i++){
            System.out.print("Segment " + (i + 1) + "'s points (x1, y1) (x2, y2): ");
            segments[i].p1.x = scan.nextInt();
            segments[i].p1.y = scan.nextInt();
            segments[i].p2.x = scan.nextInt();
            segments[i].p2.y = scan.nextInt();
        }
        System.out.printf("\nSegment with minimum length: %s\n\n", minLen(segments));
        scan.close();
    }

    public static String minLen(Segment[] segments){
        float minLen = segments[0].length(segments[0].p1, segments[0].p2);
        Segment minSeg = new Segment(segments[0].p1, segments[0].p2);
        for (int i = 0; i < segments.length; i++){
            float currentLen = segments[i].length(segments[i].p1, segments[i].p1);
            if (minLen > currentLen) minSeg = segments[i];
        }
        return printSegment(minSeg);
    }

    public static String printSegment(Segment s){
        return String.format("[(%.0f, %.0f), (%.0f, %.0f)]", s.p1.x, s.p1.y, s.p2.x, s.p2.y);
    }

    public static class Point { 
        private float x;
        private float y;
        
        public Point() {
           this(3, 4);
        }
    
        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }
    
        public float getX() {
            return this.x;
        }
    
        public float getY() {
            return this.y;
        }
    
        public void translate(float dx, float dy) {
            this.x += dx;
            this.y += dy;
        }
    
        public float distance(Point p) {
            return (float) Math.sqrt(Math.pow(p.getX() - this.x, 2) +
                                    Math.pow(p.getY() - this.y, 2));
        }
    
    }
    
    public static class Segment {
        
        private Point p1;
        private Point p2;

        public Segment(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
    
        public Segment(float x1, float y1, float x2, float y2) {
            this(new Point (x1, y1), new Point (x2, y2));
        }
    
        public void translate (float dx, float dy) {
            this.p1.translate(dx, dy);
            this.p2.translate(dx, dy);
        }
    
        public float length (Point p1, Point p2) {
            return (float) Math.abs(Math.sqrt(p1.getX() - p2.getX())) + (float) Math.abs(Math.sqrt(p1.getY() - p2.getY()));
        }
    
        public float getSlope () {
            return (p1.getX() - p2.getX()) / (p1.getY() - p2.getY());
        }
    
        public float getIntercept () {
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
}
