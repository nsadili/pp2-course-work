package Week06;
public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);

        Point p2 = (Point) p1.clone();
        Point p3 = new Point(6, 8);
        Point p4 = new Point(8, 9);
        Segment s1 = new Segment(p3, new Point(6, 7));
        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        Segment s2 = (Segment) s1.clone(); // there is a problem :(
        System.out.println(s2);
        p1.moveUp(5);
    }
    var arr = new Object[5];
    arr[0] = p1;
    arr[1] = p2;
    arr[2] = s1;
    arr[3] = s2;
    static void MoveAllUp(Movable[] arr){
        for (Movable obj: arr){
            obj.moveUp(1);
        }
    }
}
