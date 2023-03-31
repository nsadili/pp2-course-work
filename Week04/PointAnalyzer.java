import java.util.Scanner;

public class PointAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numOfPoints = scanner.nextInt();

        Point[] points = new Point[numOfPoints];

        for (int i = 0; i < numOfPoints; i++) {
            System.out.println("Enter details for Point #" + (i+1));

            System.out.print("X: ");
            double x = scanner.nextDouble();

            System.out.print("Y: ");
            double y = scanner.nextDouble();

            points[i] = new Point(x, y);
        }

        Point northern = points[0];
        Point southern = points[0];
        Point western = points[0];
        Point eastern = points[0];

        for (int i = 1; i < numOfPoints; i++) {
            if (points[i].getY() > northern.getY()) {
                northern = points[i];
            }

            if (points[i].getY() < southern.getY()) {
                southern = points[i];
            }

            if (points[i].getX() < western.getX()) {
                western = points[i];
            }

            if (points[i].getX() > eastern.getX()) {
                eastern = points[i];
            }
        }

        System.out.println("Northernmost Point: " + northern);
        System.out.println("Southernmost Point: " + southern);
        System.out.println("Westernmost Point: " + western);
        System.out.println("Easternmost Point: " + eastern);
    }
}

