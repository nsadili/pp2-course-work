package ex6;

import java.util.Arrays;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Point p1 = new Point(8, 8);
        Point p2 = new Point(4, 12);
        final Circle c1 = new Circle(5);
        Circle c2 = new Circle(p2, 6);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(1, 2, 3, 5);
        p1.moveUp(2).moveRight(4);
        System.out.println(p1);
        s1.moveDown(2).moveDown(4);
        System.out.println(s1);
        c1.moveRight(4).moveUp(5);
        System.out.println(c1);

        var arr = new Movable[6];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = s1;
        arr[3] = s2;
        arr[4] = c1;
        arr[5] = c2;
        MoveAllUp(arr);
        System.out.println("Points, Segments, Circles: " + Arrays.toString(arr));

    }

    static void MoveAllUp(Movable[] arr) {
        for (Movable obj : arr) {
            obj.moveUp(4);
        }

    }
}
}
