package Week06.Exercises;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle rec1 = new Rectangle(5, 10);
        Rectangle rec2 = new Rectangle(15, 10);
        Rectangle rec3 = new Rectangle(5, 10);
        System.out.println(rec1.equals(rec2));
        System.out.println(rec1.equals(rec3));
        System.out.println();

        Object obj1 = new Rectangle(5, 10);
        Object obj2 = new Rectangle(15, 15);
        Object obj3 = new Square(15);
        System.out.println("Objects are ideatical: " + obj1.equals(obj2));
        System.out.println("Objects are ideatical: " + obj1.equals(obj3));
        System.out.println("Objects are ideatical: " + obj2.equals(obj3));
        System.out.println();
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
    }
}
