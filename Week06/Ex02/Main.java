package Week06.Ex02;

import Week06.Ex03.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);
        Rectangle r4 = new Rectangle(2,2);
        Square s1 = new Square(2);
        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true
        System.out.println(r4.equals(s1)); // true
    }
}
