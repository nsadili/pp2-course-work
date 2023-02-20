import java.util.Arrays;
import java.util.Scanner;
import geometry.Segment;
import geometry.Point;

public class ArrayOfSegments {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter amount of segments: ");
        int n = scn.nextInt();
        Segment[] segments = new Segment[n];
        for(int i=0; i<n; i++) {
            System.out.println("Segment " + (i+1));
            System.out.print("Enter x1: ");
            double x1 = scn.nextDouble();
            System.out.print("Enter y1: ");
            double y1 = scn.nextDouble();
            System.out.print("Enter x2: ");
            double x2 = scn.nextDouble();
            System.out.print("Enter y2: ");
            double y2 = scn.nextDouble();
            Segment newSegment = new Segment(x1, y1, x2, y2);
            segments[i] = newSegment;
            System.out.println("----------------");
        }
        double min = 1000000;
        int minIndex =  0;
        for(int i=0; i < n; i ++) {
            if(segments[i].length() < min) {
                min = segments[i].length();
                minIndex = i;
            }
        }
        System.out.println("Shortest segment is Segment " + (minIndex+1) + " with length " + min);
    }
}
