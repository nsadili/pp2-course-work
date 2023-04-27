class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Point cloned = (Point) super.clone();
        cloned.setX(this.getX());
        cloned.setY(this.getY());
        return cloned;
    }
}

class Segment implements Cloneable {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Segment cloned = (Segment) super.clone();
        cloned.start = (Point) this.start.clone();
        cloned.end = (Point) this.end.clone();
        return cloned;
    }
}
