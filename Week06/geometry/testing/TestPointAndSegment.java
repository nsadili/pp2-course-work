package geometry.testing;

import geometry.others.Movable;
import geometry.others.Point;
import geometry.others.Segment;

public class TestPointAndSegment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(3, 4);
        Segment s1 = new Segment(p1, p2);

        System.out.println(s1);
        s1.moveDown(3).moveLeft(2);
        System.out.println(s1);

        var x = new Movable[5];
        x[0] = p1;
        x[0] = s1;
    }
}
