public class ArrayOfSegments {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Segment(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope() {
        if (x2 == x1) {
            return Double.POSITIVE_INFINITY;
        }
        return (y2 - y1) / (x2 - x1);
    }
}

public class Main {
    public static Segment findSegmentWithMaxSlope(Segment[] segments) {
        double maxSlope = Double.NEGATIVE_INFINITY;
        Segment maxSlopeSegment = null;

        for (Segment segment : segments) {
            double slope = segment.slope();
            if (slope > maxSlope) {
                maxSlope = slope;
                maxSlopeSegment = segment;
            }
        }

        return maxSlopeSegment;
    }

    public static void main(String[] args) {
        Segment[] segments = {
                new Segment(1, 1, 4, 4),
                new Segment(2, 2, 5, 5),
                new Segment(3, 3, 6, 6),
                new Segment(0, 0, 2, 2),
                new Segment(7, 7, 9, 9)
        };

        Segment segmentWithMaxSlope = findSegmentWithMaxSlope(segments);

        System.out.println("Segment with maximum slope:");
        System.out.println(segmentWithMaxSlope.slope());
        System.out.println("Endpoints: (" + segmentWithMaxSlope.x1 + ", " + segmentWithMaxSlope.y1 + "), (" + segmentWithMaxSlope.x2 + ", " + segmentWithMaxSlope.y2 + ")");
    }
}