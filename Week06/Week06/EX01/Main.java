package Week06.EX01;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(3, 6);
        Point p2 = new Point(5, 7);

        Segment s1 = new Segment(p1, p2);

        System.out.println(s1);
    }
}