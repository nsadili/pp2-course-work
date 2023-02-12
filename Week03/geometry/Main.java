package Week03.geometry;

public class Main {
    public static void main(String[] args){
        Point p1 = new Point(3,4);
        Point p2 = new Point(4,5);
        System.out.println(p1.getX());
        System.out.println(p2.getY());
        System.out.println(p2.equals(p2));
        Segment s1 = new Segment(p1,p2);
        System.out.println(s1.getIntercept());
        System.out.println(s1.getSlope());
    }
}
