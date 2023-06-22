package Week03.geometry;

public class Main {
    public static void main(String[]args){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);

        p2.translate(5, 10);

        boolean isEqual = p1.equals(p2) ? true : false;
        System.out.println(isEqual ? "Yes" : "No");

        Segment s1 = new Segment(p1, p2);
        System.out.println(s1.length());
    }
}