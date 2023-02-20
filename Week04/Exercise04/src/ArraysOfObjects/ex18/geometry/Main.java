package ArraysOfObjects.ex18.geometry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = new Segment(1, 2, 3, 4).toString();
        System.out.println(a);
        String b = new Point(5, 7).toString();
        System.out.println(b);
    }
}
