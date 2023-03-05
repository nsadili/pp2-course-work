public class RectanSquareTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(2, 5);
        // Object s1 = new Square(3);

        Square s1 = new Square(2);
        System.out.println(r1.equals(r3));
        System.out.println(s1.equals(r2));
        System.out.println(r2.equals(s1));

        Rectangle rCopy = (Rectangle) r1.clone();
        rCopy.set(5, 5);
        System.out.println(r1.equals(rCopy));
        System.out.println(r1 == rCopy);
    }

}
