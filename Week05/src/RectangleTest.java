package Week05.src;

import java.util.*;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r3));
        System.out.println(r1.equals(r3));
    }
}
