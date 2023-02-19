import java.util.*;

class Segment {
    private int start;
    private int end;

    public Segment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getLength() {
        return end - start;
    }

    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}

public class ArrayOfSegments {

    public static Segment[] getMinLengthSegments(Segment[] segments) {
        int minLength = Integer.MAX_VALUE;
        int count = 0;
        int index = 0;
        for (int i = 0; i < segments.length; i++) {
            int length = segments[i].getLength();
            if (length < minLength) {
                minLength = length;
                count = 1;
            } else if (length == minLength) {
                count++;
            }
        }

        Segment[] minSegments = new Segment[count];
        for (int i = 0; i < segments.length; i++) {
            if (segments[i].getLength() == minLength) {
                minSegments[index++] = segments[i];
            }
        }

        return minSegments;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSegments = sc.nextInt();
        sc.nextLine();

        Segment[] segments = new Segment[numSegments];
        for (int i = 0; i < numSegments; i++) {
            System.out.println("Enter the start and end points of segment " + (i + 1) + ":");
            int start = sc.nextInt();
            int end = sc.nextInt();
            sc.nextLine();
            segments[i] = new Segment(start, end);
        }

        Segment[] minSegments = getMinLengthSegments(segments);

        for (int i = 0; i < minSegments.length; i++) {
            System.out.println(minSegments[i]);
        }
    }
}
