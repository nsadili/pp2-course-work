public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);
        System.out.println(rl.equals(r2));
        System.out.println(rl.equals(r3));

    }
}
