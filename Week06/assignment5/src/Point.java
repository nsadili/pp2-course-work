class Point implements Cloneable {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Segment implements Cloneable {
    private Point start, end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Segment cloned = (Segment) super.clone();
        cloned.start = (Point) start.clone();
        cloned.end = (Point) end.clone();
        return cloned;
    }
}
