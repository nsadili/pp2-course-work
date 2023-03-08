package Week06.MovableInterface;

import ArrayOfPoint.Point;
import ArrayOfSegemnts.Segment;

public class Main {
    public static void main(String[] args) {
        Cycle c = new Cycle(4, 6, 2);
        c.moveUp();
        System.out.println(c.getP().getX() + " " + c.getP().getY());

        Object[] o = { new Point(4, 5), new Segment(5, 6, 0, 0), new Point(0, 0), new Cycle(1, 0, 1) };

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i].toString());
        }
    }

}
