import java.util.*;

public class ArraysOfSegment {
    public static Segment[] findMinLengthSegments(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return new Segment[0]; 
        }
        Segment[] minSegments = new Segment[segments.length];
        int minIndex = 0;
        int minLength = segments[0].getLength();
        for (int i = 0; i < segments.length; i++) {
            int length = segments[i].getLength();
            if (length < minLength) {
                minLength = length;
                minIndex = 0;
                minSegments[minIndex] = segments[i];
            } else if (length == minLength) {
                minSegments[++minIndex] = segments[i];
            }
        }
        return Arrays.copyOf(minSegments, minIndex + 1);
    }
    
}