package Week05.EX12;

import Week05.EX11.rectangle;

public class Main {
    public static void main(String[] args) {
        Object ol = new rectangle(5, 10);
        Object o2 = new rectangle(15, 15);
        Object o3 = new square(15);

        System.out.println("Objects are identical: " + ol.equals(o2));
        System.out.println("Objects are identical: " + ol.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}