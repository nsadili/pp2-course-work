package Week05.SquareAndRectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(10, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r3.equals(r1));

        Object o1 = new Rectangle(15, 15);
        Object o2 = new Square(15);
        Object o3 = new Rectangle(14, 34);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));

    }
}
