package Week04.ToString;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(startPoint.toString()).append(", ").append(endPoint.toString()).append("]");
        return sb.toString();
    }
}