public class Segment {
    private int start;
    private int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

public static List<Segment> minLengthSegments(Segment[] segments) {
    int minLength = Integer.MAX_VALUE;
    List<Segment> minSegments = new ArrayList<>();
    for (Segment segment : segments) {
        int length = Math.abs(segment.getEnd() - segment.getStart());
        if (length < minLength) {
            minLength = length;
            minSegments = new ArrayList<>(Arrays.asList(segment));
        } else if (length == minLength) {
            minSegments.add(segment);
        }
    }
    return minSegments;
}
