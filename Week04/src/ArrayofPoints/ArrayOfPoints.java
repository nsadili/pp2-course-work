package ArrayofPoints;

public class ArrayOfPoints {
    private int x;
    private int y;

    public ArrayOfPoints(int x, int y) {
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

    public double getDistance(ArrayOfPoints p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public String getClosestPole() {
        ArrayOfPoints north = new ArrayOfPoints(0, 1);
        ArrayOfPoints south = new ArrayOfPoints(0, -1);
        ArrayOfPoints east = new ArrayOfPoints(1, 0);
        ArrayOfPoints west = new ArrayOfPoints(-1, 0);

        ArrayOfPoints[] coordinates = { north, south, east, west };
        double[] distance = new double[4];

        for (int i = 0; i < coordinates.length; i++) {
            distance[i] = getDistance(coordinates[i]);
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
}