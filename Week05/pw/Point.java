package pw;



public class Point{

    private double x;
    private double y;

public Point(int i, int j) {
    }

public double getDistance(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2) );
    }

    public double getClosest(Point p)
    {
        Point north = new Point(0, 1);
        Point south = new Point(0, -1);
        Point east = new Point(1, 0);
        Point west = new Point(-1, 0);
        Point [] coordinates = {north, south, west, east};
        
        double [] distance = new double[4];
        for (int i = 0; i<coordinates.length; i++)
        {
            distance[i] = getDistance(p, coordinates[i]);

        }
        double minimalDistance = getMinimum(distance);

        return findTheClosest(distance, minimalDistance);
    }

    
    private double findTheClosest(double[] distance, double minimalDistance) {
        return minimalDistance;
        
    }

    public double getMinimum(double [] arr)
    {
        double min = arr[0];
        for(int i = 1; i<arr.length;i++)
        {
            if (min > arr[i])
                min = arr[i];
        }

        return min;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
     public static void main(String[] args) {
        Point[] points = new Point[] {
            new Point(3, 5),
            new Point(2, 8),
            new Point(1, 2),
            new Point(7, 6),
            new Point(9, 3),
            new Point(5, 4)
        };
        for (int i = 1; i < points.length; i++) {
            Point current = points[i];
    }

}

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}