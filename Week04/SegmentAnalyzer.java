import java.util.ArrayList;
import java.util.List;

public class SegmentAnalyzer {
    public static void main(String[] args) {
        // Sample segments
        Segment[] segments = {
            new Segment(1, 2),
            new Segment(3, 4),
            new Segment(5, 6),
            new Segment(7, 8),
            new Segment(9, 10),
            new Segment(5, 6)
        };

        Segment[] minSegments = getSegmentsWithMinLength(segments);

        System.out.println("Segment(s) with minimum length: ");
        for (Segment segment : minSegments) {
            System.out.println(segment);
        }
    }

    public static Segment[] getSegmentsWithMinLength(Segment[] segments) {
        double minLength = Double.MAX_VALUE;
        
        // Find the minimum length
        for (Segment segment : segments) {
            double length = segment.getLength();
            if (length < minLength) {
                minLength = length;
            }
        }

        // Collect segments with minimum length
        List<Segment> minSegmentsList = new ArrayList<>();
        for (Segment segment : segments) {
            if (segment.getLength() == minLength) {
                minSegmentsList.add(segment);
            }
        }

        // Convert list to array
        Segment[] minSegments = new Segment[minSegmentsList.size()];
        minSegmentsList.toArray(minSegments);

        return minSegments;
    }
}

class Segment {
    private int start;
    private int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return Math.abs(end - start);
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}
