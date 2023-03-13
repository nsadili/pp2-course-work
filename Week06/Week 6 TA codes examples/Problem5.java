public class Problem5 {
    public static void main(String[] args) {
        Point a = new Point(1,2);
        Point b = (Point) a.clone();


        Segment c = new Segment(1,1,2,2);
        Segment d = (Segment) c.clone();

        System.out.println(b);
        System.out.println(d);
    }
}
