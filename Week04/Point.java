package Week04;

    public class Point{
    private int x;
    private int y;
    public Point () {}

    public Point (Point p ) {

        this(p.x, p.y);
    }

    public int getX() {

        return x;
    }

    public void setX(int x ) {

        this.x= x;
    }

    public int getY() {

        return y ;
    }

    public void setY(int y ) {

        this.y = y;
    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public float getDistance (Point p) {
        return (float) Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
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
            distance[i] = getDistance(coordinates[i]);

        }

        double minimalDistance = getMinimum(distance);

        return findTheClosest(distance, minimalDistance);
    }

    private double findTheClosest(double[] distance, double minimalDistance) {
        return 0;
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