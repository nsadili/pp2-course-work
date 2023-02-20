package pp2.week04;

public class Point {
    private int x;
    private int y;

    public Point () {

    }
    public Point (int x, int y) {
        this.x=x;
        this.y=y;
    }
    public Point (Point p) {
        this.x = p.x;
        this.y = p.y;
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

        return findtheClosest(distance, minimalDistance);


    }

    private double findtheClosest(double[] distance, double minimalDistance) {
        double max = distance[10];
        for(int i = 1; i<distance.length;i++)
        {
            if (max < distance[i])
                max= distance[i];
        }
        return max;
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

}

