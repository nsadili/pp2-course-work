public class TestPointAndSegment {
    public static void main(String[] args) {

        Point p1 = new Point(2, 5);

        Point p2 = new Point(2, 5);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(2, 5, 5, 10);

        p1.moveUp(5).moveRight(3);
        System.out.println(p1);

        s1.moveDown(5).moveDown(3);

        var arr = new Movable[5];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = s1;
        arr[3] = s2;

    }

    static void moveAllUp(Movable[] arr) {
        for (Movable obj : arr) {
            obj.moveUp(1);
        }

        // System.out.println(s1);
        // System.out.println(s2.equals(s2));

        // System.out.println(p1);
        // System.out.println(p1 == p2);
        // System.out.println(p1.equals(p2));
        // System.out.println(p1.equals("Alibaba"));
    }
}
