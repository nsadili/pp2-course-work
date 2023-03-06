public class Main {
    public static void main(String[] args) {
        Point p = new Point(6, 4);
        Point p1 = new Point(9, 3);
        Point p3 = new Point(3, 7);
        Point p4 = new Point(7, 6);

        Segment sg = new Segment(p,p1);
        Segment sg2 = new Segment(p3, p4);

        System.out.println(p.toString());
        System.out.println(p.equals(p1));
        System.out.println(sg.equals(sg2));
    }
}