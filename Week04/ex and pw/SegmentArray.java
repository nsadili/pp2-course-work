import week04.geometry.Segment;
import java.util.Scanner;

public class SegmentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Segment[] seg = new Segment[n];
        for (int i = 0; i < n; i++) {
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double y2 = sc.nextDouble();
            seg[i] = new Segment(x1, y1, x2, y2);
        }
        double mn = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (seg[i].length() < mn)
                mn = seg[i].length();
        }
        System.out.println("min" + mn);
        for (int i = 0; i < n; i++) {
            if (seg[i].length() == mn)
                System.out.println("segment: " + i + 1 + ", " + seg[i].toString());
        }
    }
}
