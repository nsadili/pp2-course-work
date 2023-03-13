public class Point implements Cloneable {
    private float x;
    private float y;

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class Segment implements Cloneable {
    private Point p1;
    private Point p2;

    @Override
    public Segment clone() {
        try {
            Segment cloned = (Segment) super.clone();
            cloned.p1 = p1.clone();
            cloned.p2 = p2.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}