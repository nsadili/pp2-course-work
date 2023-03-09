public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point();

        Point p2 = (Point) p1.clone();

        System.out.println(p1.getX() + ", " + p1.getX());
        System.out.println(p2.getX() + ", " + p2.getX());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}