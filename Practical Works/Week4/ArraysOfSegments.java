import java.util.ArrayList;
import java.util.List;

class Segment {
    private double length;

    public Segment(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}

public class ArraysOfSegments {
    public static Segment[] findSegmentsWithMinimumLength(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return new Segment[0]; 
        }

        List<Segment> minSegments = new ArrayList<>();
        double minLength = Double.MAX_VALUE;

        for (Segment segment : segments) {
            double length = segment.getLength();

            if (length < minLength) {
                minLength = length;
                minSegments.clear();
                minSegments.add(segment);
            } else if (length == minLength) {
                minSegments.add(segment);
            }
        }

        return minSegments.toArray(new Segment[0]);
    }

    public static void main(String[] args) {

        Segment[] segments = new Segment[4];
        segments[0] = new Segment(5.2);
        segments[1] = new Segment(3.8);
        segments[2] = new Segment(7.1);
        segments[3] = new Segment(3.8);

        Segment[] minSegments = findSegmentsWithMinimumLength(segments);

        System.out.println("Segments with the min length:");
        for (Segment segment : minSegments) {
            System.out.println("Length: " + segment.getLength());
        }
    }
}
