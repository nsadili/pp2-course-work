package geometry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);

        Point p1 = new Point(2.0f, 3.0f);
        Point p2 = new Point(x, y);

        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 1: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Are point 1 and Point 2 are equal? " + p1.equals(p2));
        p1.translate(1.0f, 1.0f);
        System.out.println("Translated Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
        System.out.println("Are Point 1 and Point 2 equal after p1 was translated? " + p1.equals(p2));

        System.out.println("Enter new coordinates for the Point 1: ");
        Scanner sc = new Scanner(System.in);
        float new_x = sc.nextFloat();
        float new_y = sc.nextFloat();

        p1.setX(new_x);
        p2.setY(new_y);
        System.out.println("Point 1 after resetting: (" + p1.getX() + ", " + p1.getY() + ")");

    }

}
