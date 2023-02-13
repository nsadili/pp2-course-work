package Week03.ex.geometry;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(4, 7);

        System.out.println(p1.getX());
        System.out.println(p2.getY());
        System.out.println(p1.equals(p2));

        Segment s1 = new Segment(6.0f,9.0f, 10.0f, 20.0f);
        System.out.println(s1.getIntercept()); 
        System.out.println(s1.getSlope());
    }
}
