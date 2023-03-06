package ex1_5_6;

public class Main_ex1_5 {
    public static void main(String args[]) {
        Point p1 = new Point(4, 6);
        Point p2 = new Point(7, 9);

        Point p4 = (Point) p2.clone();
        System.out.println(p2.toString());
        p4.setX(5);
        System.out.println(p4.toString());
        System.out.println();


        Segment s1 = new Segment(p1, p2);
        Segment s2 = (Segment) s1.clone();

        System.out.println(s1 + " " + s2);
        s2.getP2().setX(12);
        System.out.println(s1 + " " + s2);
    }
}
