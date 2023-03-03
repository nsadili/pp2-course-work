package RectanglesAndSquares;
public class RectTest {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(15, 10);
        Rectangle rect3 = new Rectangle(5, 10);

        System.out.println(rect.equals(rect2));
        System.out.println(rect.equals(rect3));

        System.out.println();

        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println(o3.equals(o1));
        System.out.println(o3.equals(o2));
    }
}
