package Week04.pw16;
import java.util.Scanner;

public class Main {
    public static void pointFind(Point[] points){
        Point northern = points[0];
        Point southern = points[0];
        Point western = points[0];
        Point eastern = points[0];
        for (int i = 0; i < points.length; i++){
            if (points[i].getY() >= northern.getY()) northern = points[i];
            if (points[i].getY() <= southern.getY()) southern = points[i];
            if (points[i].getX() <= western.getX()) western = points[i];
            if (points[i].getX() >= eastern.getX()) eastern = points[i];
        }
        System.out.printf("\nThe most northern point: %s\nThe most southern point: %s\nThe most western point: %s\nThe most eastern point: %s\n\n", String.format("(%.0f, %.0f)", northern.getX(), northern.getX()), String.format("(%.0f, %.0f)", southern.getX(), southern.getX()), String.format("(%.0f, %.0f)", western.getX(), western.getX()), String.format("(%.0f, %.0f)", eastern.getX(), eastern.getX()));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Amount of points: ");
        int n = scan.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++){
            System.out.printf("%d) Point(x, y): ", i + 1);
            double x = scan.nextInt();
            double y = scan.nextInt();
            points[i].setPoint(x, y);
        }
        pointFind(points);
        scan.close();
    }
}
