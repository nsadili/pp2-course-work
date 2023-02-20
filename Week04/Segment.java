package Week04;

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

    public int getLength() {
        return end - start;
    }
    public static Segment[] findMinLengthSegments(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return new Segment[0];
        }
        int minLength = Integer.MAX_VALUE;
        int count = 0;
        for (Segment segment : segments) {
            int length = segment.getLength();
            if (length < minLength) {
                minLength = length;
                count = 1;
            } else if (length == minLength) {
                count++;
            }
        }
        Segment[] minSegments = new Segment[count];
        int index = 0;
        for (Segment segment : segments) {
            if (segment.getLength() == minLength) {
                minSegments[index] = segment;
                index++;
            }
        }
        return minSegments;
    }
    public static void main(String[] args) {
        Segment[] segments = {
            new Segment(1, 3),
            new Segment(2, 5),
            new Segment(6, 9),
            new Segment(4, 7),
            new Segment(8, 10)
        };
        Segment[] minSegments = findMinLengthSegments(segments);
        for (Segment segment : minSegments) {
            System.out.println("Start: " + segment.getStart() + ", End: " + segment.getEnd());
        }
    }
    
}
