import java.util.zip.GZIPOutputStream;

public class Point {
    private double x;
    private double y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getDistance(Point p) {
        return Math.sqrt((p.x - this.x)*(p.x - this.x)+(p.y - this.y)*(p.y - this.y)); 
    }

    public String getClosestPole()
    {
        Point north = new Point(0,1);
        Point south = new Point(0, -1);
        Point east  = new Point(1,0);
        Point west  = new Point(-1, 0);
        
        Point [] coordinates = {north, south, west, east};
        double [] distance = new double[4];

        for(int i = 0; i < coordinates.length; i++)
        {
            distance[i] = getDistance(coordinates[i]);
        }


        return findTheClosest(distance);
    }

    public String findTheClosest(double []arr)
    {

        double minimum = getMinimum(arr);

        if (minimum == arr[0]) return "North";
        if(minimum == arr[1]) return "South";
        if(minimum == arr[2]) return "West";
        return "East";

    }

    public double getMinimum(double [] arr)
    {
        double min = arr[0];

        for(int i = 1; i < arr.length ; i++)
        {
            if (min > arr[i])
                min = arr[i];
        }

        return min;
    }





    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}


