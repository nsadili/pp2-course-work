import java.util.*;

public class ArrayOfSegments {

    public static int getLength(int[] segment) {
        return segment[1] - segment[0];
    }

    public static int[][] getMinLengthSegments(int[][] segments) {
        int minLength = Integer.MAX_VALUE;
        int count = 0;
        int index = 0;
        for (int i = 0; i < segments.length; i++) {
            int length = getLength(segments[i]);
            if (length < minLength) {
                minLength = length;
                count = 1;
            } else if (length == minLength) {
                count++;
            }
        }

        int[][] minSegments = new int[count][2];
        for (int i = 0; i < segments.length; i++) {
            if (getLength(segments[i]) == minLength) {
                minSegments[index++] = segments[i];
            }
        }

        return minSegments;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSegments = sc.nextInt();

        int[][] segments = new int[numSegments][2];
        for (int i = 0; i < numSegments; i++) {
            System.out.println("Enter the start and end points of segment " + (i + 1) + ":");
            int start = sc.nextInt();
            int end = sc.nextInt();

            segments[i][0] = start;
            segments[i][1] = end;
        }

        int[][] minSegments = getMinLengthSegments(segments);

        for (int i = 0; i < minSegments.length; i++) {
            System.out.println("[" + minSegments[i][0] + ", " + minSegments[i][1] + "]");
        }
    }
}