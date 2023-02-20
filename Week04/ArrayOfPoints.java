import java.util.Scanner;

class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public double distance(Point other) {
        int dx = other.getX() - x;
        int dy = other.getY() - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}

public class ArrayOfPoints{

    public static void main(String[] args) {
        Point[] points ={new Point(1,0),new Point(0,1),new Point(-1,0) ,new Point(0,-1)};
        try (Scanner input = new Scanner(System.in)) {
            int x = input.nextInt();
            int y = input.nextInt();
            Point ourpoint = new Point(x, y);

            Point closestPoint = points[0];
            double minDistance = ourpoint.distance(closestPoint);

            for (int i = 1; i < points.length; i++) {
                Point currentPoint = points[i];
                double distance = ourpoint.distance(currentPoint);
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPoint = currentPoint;
                }
            }
            System.out.println( closestPoint.getX()+  closestPoint.getY());
        }
    }
}