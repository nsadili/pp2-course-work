package geometry.testing;

import geometry.figures.Rectangle;
import geometry.figures.Square;

public class TestRectAndSquare {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 2);
        Square s1 = new Square(3);

        System.out.println(r1.equals(r2));

        System.out.println(r2.equals(s1));

        Rectangle rCopy = (Rectangle) r1.clone();
        System.out.println(r1.equals(rCopy));
        System.out.println(r1 == rCopy);
    }
}
