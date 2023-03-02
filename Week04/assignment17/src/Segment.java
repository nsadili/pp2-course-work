import java.util.ArrayList;
import java.util.List;

public class Segment {
    private double x1, y1, x2, y2;

    public Segment(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static Segment[] getMinimumLengthSegments(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return null;
        }

        double minLength = Double.MAX_VALUE;
        for (Segment s : segments) {
            double length = s.length();
            if (length < minLength) {
                minLength = length;
            }
        }

        List<Segment> minLengthSegments = new ArrayList<>();
        for (Segment s : segments) {
            if (s.length() == minLength) {
                minLengthSegments.add(s);
            }
        }

        return minLengthSegments.toArray(new Segment[0]);
    }

    public static void main(String[] args) {
        Segment[] segments = new Segment[] {
                new Segment(0, 0, 1, 1),
                new Segment(0, 0, 2, 2),
                new Segment(0, 0, 3, 3),
                new Segment(0, 0, 4, 4)
        };

        Segment[] minLengthSegments = Segment.getMinimumLengthSegments(segments);
        System.out.println("Segments with minimum length:");
        for (Segment s : minLengthSegments) {
            System.out.println("[" + s.x1 + ", " + s.y1 + "], [" + s.x2 + ", " + s.y2 + "]");
        }
    }
}
