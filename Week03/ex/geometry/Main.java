package Week03.ex.geometry;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 7);

        System.out.println(p1.getX());
        System.out.println(p2.getY());
        System.out.println(p1.equals(p2));

        Segment s1 = new Segment(6, 9);
        System.out.println(s1.getIntercept()); 
        System.out.println(s1.getSlope());

    }
}
