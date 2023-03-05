import Ex05.Point;
import Ex05.Segment;
public class TestEx05 {
    public static void main(String[] args) {
        Point p1= new Point(1,2);
        Point p2= p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        Segment s1= new Segment(2, 3, 4, 5);
        Segment s2=s1.clone();
        System.out.println(s1);
        System.out.println(s2);
}
}
