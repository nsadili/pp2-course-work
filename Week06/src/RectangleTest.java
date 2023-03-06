public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = rect1.clone();

        System.out.println(rect1.equals(rect2));
        System.out.println(rect1 == rect2);
    }

}
