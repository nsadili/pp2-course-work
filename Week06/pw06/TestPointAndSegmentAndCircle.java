
public class TestPointAndSegmentAndCircle {
    public static void main(String[] args) {
        Point p1 = new Point(8, 8);
        Point p2 = new Point(6,10);

        p1.moveUp(5).moveDown(3);
        p1.moveLeft(5).moveRight(3);

        System.out.println(p1);
        System.out.println(p2);

        Segment s1 = new Segment(new Point(5, 6), new Point(5, 7));
        Segment s2 = new Segment(7, 5, 5, 10);

        s1.moveUp(1).moveDown(2);
        s1.moveLeft(2).moveRight(1);

        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle(new Point(0, 0), 5);
        Circle c2 = new Circle(new Point(2, 3), 7);

        c1.moveUp(5).moveDown(2);
        c1.moveLeft(5).moveRight(2);

        System.out.println(c1);
        System.out.println(c2);

        var arr = new Movable[6];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = s1;
        arr[3] = s2;
        arr[4] = c1;
        arr[5] = c2;

        moveAllUp(arr, 5);

        for(Movable obj : arr){
            System.out.println(obj);
        }
    }

    static void moveAllUp(Movable[] arr, int steps) {
        for(Movable obj : arr) {
            obj.moveUp(1);
        }
    }
}
