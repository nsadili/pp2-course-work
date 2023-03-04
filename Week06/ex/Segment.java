public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment other = (Segment) obj;
        return (p1.equals(other.p1) && p2.equals(other.p2))
                || (p1.equals(other.p2) && p2.equals(other.p1));
    }
}
