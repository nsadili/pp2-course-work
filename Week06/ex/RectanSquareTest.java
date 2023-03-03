public class RectanSquareTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(2, 5);

        Square s1 = new Square(2);

        System.out.println(r1.equals(r3));

        System.out.println(s1.equals(r2));

        System.out.println(r2.equals(s1));


    }

}
