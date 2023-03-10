public class Main {
    public static void main(String[] args) {
        Point p = new Point(3, 5);
        Point p1 = new Point(5, 6);
        Point p3 = new Point(2, 4);
        Point p4 = new Point(2, 4);
        Segment sg = new Segment(p,p1);
        Segment sg2 = new Segment(p3, p4);

        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p.equals(p1));
        System.out.println(sg.equals(sg2));
    }
}