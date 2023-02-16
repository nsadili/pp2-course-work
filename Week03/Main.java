import pp2.week03.geometry.*;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 5);

        Segment s=new Segment(p1,p2);

        System.out.printf(
        "p1: (%.2f,%.2f) and p2: (%.2f,%.2f)",
        s.getP1().getX(),s.getP1().getY(),
        s.getP2().getX(),s.getP2().getY()
        );

        /*p1.translate(2, -1);
        p2.translate(5, 2);

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));

        if (p1.equals(p2) == true)
            System.out.println("They are equal");
        else
            System.out.println("They are equal");
        if (p2.equals(p1) == true)
            System.out.println("They are equal");
        else
            System.out.println("They are equal");*/
    }
}
