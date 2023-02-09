package Week03;

import Week03.geometry.*;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(), p2 = new Point(3.4f, 1.1f), p3 = new Point(p2);
        System.out.printf(
            "p1: ( %.2f, %.2f )\np2: ( %.2f, %.2f )\np3: ( %.2f, %.2f )\n",
            p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY());
    }
}
