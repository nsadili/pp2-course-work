package Week04.Array;

import java.util.ArrayList;
import java.util.List;

public class Segment {
    private Point start;
    private Point end;
    
    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getX() - start.getX(), 2));
    }



    public static Segment[] findMinLengthSegments(Segment[] segments) {
        double minLength = Double.MAX_VALUE;
        for (Segment segment : segments) {
            double length = segment.getLength();
            if (length < minLength) {
                minLength = length;
            }
        }
        List<Segment> minSegments = new ArrayList<>();
        for (Segment segment : segments) {
            if (segment.getLength() == minLength) {
                minSegments.add(segment);
            }
        }
        return minSegments.toArray(new Segment[0]);
    }
}
