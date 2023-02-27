package Week05.EX12;

import Week05.EX11.rectangle;

public class Main {
    public static void main(String[] args) {
        Object ol = new rectangle(4, 5);
        Object o2 = new rectangle(2, 10);
        Object o3 = new square(12);

        System.out.println("identical: " + ol.equals(o2));
        System.out.println("identical: " + ol.equals(o3));
        System.out.println("identical: " + o2.equals(o3));
    }
}