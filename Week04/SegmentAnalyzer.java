import java.util.Arrays;

public class SegmentAnalyzer {
    public static void main(String[] args) {
        Segment[] segments = {
                new Segment(new Point(0,0), new Point(3,4)),
                new Segment(new Point(1,2), new Point(5,5)),
                new Segment(new Point(-1,-1), new Point(2,2))
        };

        Segment[] shortestSegments = findShortestSegments(segments);

        System.out.println("Shortest Segment(s): " + Arrays.toString(shortestSegments));
    }

    public static Segment[] findShortestSegments(Segment[] segments) {
        double minLength = segments[0].getLength();

        for (int i = 1; i < segments.length; i++) {
            double length = segments[i].getLength();
            if (length < minLength) {
                minLength = length;
            }
        }

        Segment[] shortestSegments = new Segment[segments.length];
        int count = 0;

        for (int i = 0; i < segments.length; i++) {
            if (segments[i].getLength() == minLength) {
                shortestSegments[count++] = segments[i];
            }
        }

        if (count < segments.length) {
            shortestSegments = Arrays.copyOf(shortestSegments, count);
        }

        return shortestSegments;
    }
}
