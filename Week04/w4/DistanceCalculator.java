public class DistanceCalculator {
    public static double getDistance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }
    public static double getClosest(Point p) {
        Point north = new Point(0, 1);
        Point south = new Point(0, -1);
        Point east = new Point(1, 0);
        Point west = new Point(-1, 0);
    
        Point[] coordinates = {north, south, west, east};
        double[] distance = new double[4];
    
        for (int i = 0; i < coordinates.length; i++) {
            distance[i] = getDistance(p, coordinates[i]);
        }
    
        double minimalDistance = getMinimum(distance);
        return findTheClosest(distance, minimalDistance);
    }
    
    public static double getMinimum(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static double findTheClosest(double[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        double closestIndex = getClosest(p);
        System.out.println("Index of the closest point: " + closestIndex);
    }
    }
        