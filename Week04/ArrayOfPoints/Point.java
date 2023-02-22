package Week04.ArrayOfPoints;
//import java.util.Scanner;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point p)
    {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public String getClosestPole()
    {
        Point north = new Point(0,1);
        Point south = new Point(0, -1);
        Point east  = new Point(1,0);
        Point west  = new Point(-1, 0);
        
        Point   [] coordinates = {north, south, west, east};
        double  [] distance = new double[4];

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

        for(int i =    1; i < arr.length ; i++)
        {
            if (min > arr[i])
                min = arr[i];
        }

        return min;
    }
}