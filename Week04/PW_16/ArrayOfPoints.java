package Week04.PW_16;

import java.util.Scanner;


public class ArrayOfPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many points you want to print? ");
        int n = scan.nextInt();
        System.out.println();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++){
            System.out.print("Point " + (i + 1) + " (x, y): ");
            float x = scan.nextInt();
            float y = scan.nextInt();
            points[i] = new Point(x, y);
        }
        pointInfo(points);
        scan.close();
    }

    public static void pointInfo(Point[] points){
        Point northern = points[0];
        Point southern = points[0];
        Point western = points[0];
        Point eastern = points[0];
        for (int i = 0; i < points.length; i++){
            if (points[i].y >= northern.y) northern = points[i];
            if (points[i].y <= southern.y) southern = points[i];
            if (points[i].x <= western.x) western = points[i];
            if (points[i].x >= eastern.x) eastern = points[i];
        }
        System.out.printf("\nThe most northern point: %s\nThe most southern point: %s\nThe most western point: %s\nThe most eastern point: %s\n\n", printPoint(northern), printPoint(southern), printPoint(western), printPoint(eastern));
    }

    public static String printPoint(Point p){
        return String.format("(%.0f, %.0f)", p.x, p.y);
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
}