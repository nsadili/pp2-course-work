package Week05.PW.Ex12;

import Week05.PW.Ex11.Rectangle;

public class Main {
    public static void main(String[] args) {
        Object ol = new Rectangle(5,10);
        Object o2 = new Rectangle(15,15);
        Object o3 = new Square(15);
            
        System.out.println("Objects are identical: " + ol.equals(o2)); // false
        System.out.println("Objects are identical: " + ol.equals(o3)); // false
        System.out.println("Objects are identical: " + o2.equals(o3)); // false

    }
}
