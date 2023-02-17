public class ArrayOfPoints {
    public static void main(String[] args) {
        Point p1 = new Point(10, 16);
        Point p2 = new Point(-12, 19);
        Point p3 = new Point(-30, -20);
        Point p4 = new Point(11, 8);
        Point p5 = new Point(3, -7);
        
        System.out.println(p3.getClosestPole());
    }
}
