package Week03.geometry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);

        Point p1 = new Point(x, y);
        Point p2 = new Point(x, y);


        System.out.println("Point 1: (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + "," + p2.getY() + ")");
        p1.translate(1.0f, 1.0f);
        System.out .println("Translated Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Distance betweem Point 1 and Point 2: " + p1.distance(p2));
        System.out.println("Are Point 1 and Point 2 equal? " + p1.equals(p2));

        System.out.println("Enter new coordinates for the Point 1: ");
        Scanner sc = new Scanner(System.in);
        float new_x = sc.nextFloat();
        float new_y = sc.nextFloat();

        p1.setX(new_x);
        p1.setY(new_y);

        System.out.println("Point 1 after resetting: (" + p1.getX() + ", " + p1.getY() + ")");
        sc.close();
    }
}
