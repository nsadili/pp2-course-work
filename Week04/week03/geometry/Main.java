package pp2.week03.geometry;
// @abdkzmv
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(3,1);
        Segment s1 = new Segment(p1,p2);
        System.out.println(s1.length());
    }
}