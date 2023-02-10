import pp2.week03.geometry.Point;
import pp2.week03.geometry.Segment;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4, 5);
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(0, 0, 3, 4);
        System.out.printf("p1:(%.2f,%.2f) and p2:(%.2f,%.2f)\n",
        s2.getP1().getX(),s2.getP1().getY(),
        s2.getP2().getX(),s2.getP2().getY());

        s2.translate(1, 1);
    }
}
