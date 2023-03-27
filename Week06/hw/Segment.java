
public class Segment {
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


    public String toString() {
        return "[" + start.toString() + ", " + end.toString() + "]";
    }

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment other = (Segment) obj;
        return start.equals(other.start) && end.equals(other.end);
    }
}