package Week06;

public class Main {

    public static void moveAll(Movable[] objects, int dx, int dy) {
        for (Movable obj : objects) {
            obj.moveRight(dx);
            obj.moveDown(dy);
        }
    } // This part gives and error, I do not know why

    public static void main(String[] args) {

        System.out.println("This part is for testing Rectangle class:");
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        System.out.println();

        System.out.println("This part is for testing Square class:");
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println("Objects are ideatical: " + o1.equals(o2));
        System.out.println("Objects are ideatical: " + o1.equals(o3));
        System.out.println("Objects are ideatical: " + o2.equals(o3));

        System.out.println();

        System.out.println("This part is for testing exercise 6:");

        Point p = new Point(0, 0);
        System.out.println("Original point: " + p);
        p.moveUp();
        System.out.println("Moved point: " + p);

        Segment s = new Segment(new Point(0, 0), new Point(1, 1));
        System.out.println("Original segment: " + s);
        s.moveDown();
        System.out.println("Moved segment: " + s);

        Circle c = new Circle(new Point(0, 0), 5);
        System.out.println("Original circle: " + c);
        c.moveRight();
        System.out.println("Moved circle: " + c);

        Movable[] objects = new Movable[3];
        objects[0] = new Point(0, 0);
        objects[1] = new Segment(new Point(0, 0), new Point(1, 1));
        objects[2] = new Circle(new Point(0, 0), 5);

        System.out.println("Original objects:");
        for (Movable obj : objects) {
            System.out.println(obj);
        }

        moveAll(objects, 1, -1);

        System.out.println("Moved objects:");
        for (Movable obj : objects) {
            System.out.println(obj);
        }
    }
}
