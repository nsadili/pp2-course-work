package ArrayOfPoint;

import Week06.MovableInterface.Movable;

public class Point implements Movable {
    private double x;
    private double y;

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

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    public Point() {
    }

    public double getDistance(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public String getNSWE() {
        Point north = new Point(0, 1);
        Point south = new Point(0, -1);
        Point west = new Point(-1, 0);
        Point east = new Point(0, 1);

        Point[] cord = { north, south, west, east };
        double[] distance = new double[4];

        for (int i = 0; i < 4; i++) {
            distance[i] = getDistance(cord[i]);

        }
        return findTheClosest(distance);

    }

    public String findTheClosest(double[] arr) {

        double minimum = getMinimum(arr);

        if (minimum == arr[0])
            return "North";
        if (minimum == arr[1])
            return "South";
        if (minimum == arr[2])
            return "West";
        return "East";

    }

    public double getMinimum(double[] arr) {
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        y += 1;
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        y -= 1;
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        x -= 1;
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        x += 1;
    }
}