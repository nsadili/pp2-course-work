import figures.*;

public class FiguresTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(10, 10);
        Rectangle r3 = new Rectangle(5, 10);
        Square s1 = new Square(10);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(s1));
    }
}
