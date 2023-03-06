public class TestRectangleAndSquare {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 9);
        Rectangle r2 = new Rectangle(9, 4);
        Rectangle r3 = new Rectangle(4, 9);

        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true

        Object o1 = new Rectangle(4, 9);
        Object o2 = new Rectangle(4, 4);
        Object o3 = new Square(4);

        System.out.println(o1.equals(o2)); // false
        System.out.println(o1.equals(o3)); // false
        System.out.println(o2.equals(o3)); // true

    }
}
