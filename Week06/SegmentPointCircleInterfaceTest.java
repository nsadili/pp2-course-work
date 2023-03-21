public class SegmentPointCircleInterfaceTest {
    public static void main(String[] args) {
        Point point = new Point(5, 5);
        point.moveUp();
        point.moveRight();

        Segment segment = new Segment(new Point(1, 1), new Point(3, 3));
        segment.moveDown();
        segment.moveLeft();

        Circle circle = new Circle(new Point(2, 2), 5);
        circle.getCenter().moveUp();
        circle.getCenter().moveLeft();

        System.out.println(point.toString());
        System.out.println(segment.toString());
        System.out.println(circle.toString());
    }
}
