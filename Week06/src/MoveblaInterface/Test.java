package MoveblaInterface;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movable[] shapes = new Movable[3];
        shapes[0] = new Point(0, 0);
        shapes[1] = new Segment(new Point(1, 1), new Point(2, 2));
        shapes[2] = new Circle(new Point(3, 3), 1.0);

        String direction = sc.nextLine();

        moveShapes(shapes, direction);

    }

    public static void moveShapes(Movable[] shapes, String direction) {
        for (Movable shape : shapes) {
            switch (direction) {
                case "up":
                    shape.moveUp();
                    break;
                case "down":
                    shape.moveDown();
                    break;
                case "left":
                    shape.moveLeft();
                    break;
                case "right":
                    shape.moveRight();
                    break;
                default:
                    System.out.println("Invalid direction ");
                    return;
            }
            System.out.println("After move: " + shape);
        }
        System.out.println();
    }
}    