import java.util.Arrays;

public class Segments {
    public static void main(String[] args) {
        Segments sts = new Segments();

        Segment[] segments = new Segment[] { //
                new Segment(3, 4, 5, 7), //
                new Segment(1, 2, 4, 1), //
                new Segment(7, 0, 3, -1), //
                new Segment(4, 1, 1, 2), //
                new Segment(-1, -3, -4, -1) };

        // System.out.println(Arrays.toString(segments));
        System.out.println(Arrays.toString(sts.getAllShortestSegments(segments)));
    }

    Segment[] getAllShortestSegments(Segment[] segments) {
        if (segments.length == 0)
            return new Segment[] {};

        Segment shortest = getShortestSegment(segments);
        Segment[] allShortests = new Segment[countSegments(segments, shortest.length())];

        int i = 0;
        for (Segment s : segments)
            if (s.length() == shortest.length())
                allShortests[i++] = s;

        return allShortests;
    }

    int countSegments(Segment[] segments, double length) {
        int i = 0;
        for (Segment s : segments)
            if (s.length() == length)
                i++;
        return i;
    }

    Segment getShortestSegment(Segment[] segments) {
        if (segments.length == 0)
            return null;

        Segment shortest = segments[0];
        for (Segment s : segments) {
            if (s.length() < shortest.length())
                shortest = s;
        }
        return shortest;
    }
}
