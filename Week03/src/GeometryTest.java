import geometry.Point;
import geometry.Segment;
public class GeometryTest {
    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(15, 15);
        Segment s1 = new Segment(p1, p2);


        System.out.println(p1.equals(p2));
        System.out.println(s1.getIntercept());
    }
}
