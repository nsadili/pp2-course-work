package pp2.week4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Segment;

public class Ex17 {
    public static Segment[] findShortestSegments(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return new Segment[0];
        }
    
        double minLength = segments[0].length();
        for (int i = 1; i < segments.length; i++) {
            double length = segments[i].length();
            if (length < minLength) {
                minLength = length;
            }
        }
    
        List<Segment> shortestSegments = new ArrayList<>();
        for (int i = 0; i < segments.length; i++) {
            if (segments[i].length() == minLength) {
                shortestSegments.add(segments[i]);
            }
        }
    
        return shortestSegments.toArray(new Segment[0]);
    }
}
