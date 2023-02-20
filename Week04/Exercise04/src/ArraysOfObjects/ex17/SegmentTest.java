package ArraysOfObjects.ex17;

import java.util.Arrays;

public class SegmentTest {
    public static void main(String args[]) {
        Segment a[] = new Segment[5];
        a[0] = new Segment(1, 2, 3, 4);
        a[1] = new Segment(3, 2, 3, 5);
        a[2] = new Segment(-2, 2, 4, 1);
        a[3] = new Segment(1, -4, 3, 2);
        a[4] = new Segment(5, 7, 3, -3);

        printArrayOfSegments(minLen(a));
    }

    public static Segment[] minLen(Segment arr[]) {
        double min = Double.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLength() < min) min = arr[i].getLength();
            if (arr[i].getLength() == min) cnt++;
            else cnt = 0;
        }

        Segment minArr[] = new Segment[cnt + 1];
        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLength() == min) {
                minArr[cnt] = arr[i];
                cnt++;
            }
        }

        return minArr;
    }

    public static void printArrayOfSegments(Segment arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("(" + arr[i].getP1().getX() + ", " + arr[i].getP1().getY() + "), ("
            + arr[i].getP2().getX() + ", " + arr[i].getP2().getY() + ")");
        }
    }
}
