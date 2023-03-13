public class Segment {
    private Point start;
    private Point end;


    @Override
    public String toString() {
        return "[" + start.toString() + ", " + end.toString() + "]";
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

        return this.start.equals(other.start) && this.end.equals(other.end);
    }
}
