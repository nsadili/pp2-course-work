package EX;

enum Directions {
    right, left, down, up
};

public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(2, 5);

        System.out.println(p1 == p2);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals("Hello"));
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(3, 5, 2, 5);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        p1.moveDown(4).moveRight(10);
        s2.moveDown(4).moveLeft(3);
        System.out.println(s2);
        Circle c1 = new Circle(p1, 5);
        Circle c2 = new Circle(p1, 5);
        c1.moveRight(2).moveDown(3);
        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println("Result of an array:");
        var x = new Movable[5];
        x[0] = p1;
        x[1] = p2;
        x[2] = s1;
        x[3] = s2;
        x[4] = c1;
        printMovable(x);
        System.out.println("Result of changed array:");
        moveArray(x, 2, Directions.left);
        printMovable(x);

    }

    public static void printMovable(Movable x[]) {
        for (Movable var : x) {
            System.out.println(var);
        }
    }

    public static Object moveArray(Movable x[], int steps, Directions direction) {

        for (Movable var : x) {
            switch (direction) {
                case right:
                    var.moveRight(steps);
                    break;
                case left:
                    var.moveLeft(steps);
                    break;
                case down:
                    var.moveDown(steps);
                    break;
                default:
                    var.moveUp(steps);
            }
        }
        return x;
    }
}
