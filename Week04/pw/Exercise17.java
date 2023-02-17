package Week04.pw;

import java.util.Scanner;
import java.util.Arrays;
import Week03.geometry.Segment;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of segments you want to enter: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Ok, bye");
            return;
        }
        Segment[] segs = new Segment[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Segment #" + (i + 1));
            System.out.print("Please enter the X coordinate of Point 1: ");
            float x1 = sc.nextFloat();
            System.out.print("Please enter the Y coordinate of Point 1: ");
            float y1 = sc.nextFloat();
            System.out.print("Please enter the X coordinate of Point 2: ");
            float x2 = sc.nextFloat();
            System.out.print("Please enter the Y coordinate of Point 2: ");
            float y2 = sc.nextFloat();
            segs[i] = new Segment(x1, y1, x2, y2);
        }
        System.out.println("Longest segment(s): ");
        for (Segment s : findLongest(segs)) {
            System.out.printf("( %f, %f ) - ( %f, %f )\n", s.getP1().getX(), s.getP1().getY(), s.getP2().getX(), s.getP2().getY());
        }
    }

    public static Segment[] findLongest(Segment[] segs) {
        Segment[] res = {};
        float len = 0;
        for (int i = 0; i < segs.length; i++) {
            if (segs[i].length() > len) {
                len = segs[i].length();
                res = new Segment[] { segs[i] };
            } else if (segs[i].length() == len) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = segs[i];
            }
        }
        return res;
    }
}
