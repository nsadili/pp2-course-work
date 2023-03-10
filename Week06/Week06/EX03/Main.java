package Week06.EX03;

import Week06.EX02.Rectangle;

public class Main {
    public static void main(String[] args) {
        Object o1 = new Rectangle(2, 39);
        Object o2 = new Rectangle(21, 12);
        Object o3 = new Square(16);
        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}