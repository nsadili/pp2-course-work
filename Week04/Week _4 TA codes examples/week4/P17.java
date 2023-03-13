package week04;

import week03.geometry.Segment;

import java.util.Scanner;
/*
    Same "find minimum" approach : check P2
 */
public class P17 {
    public static Segment[] getAllAnswers(Segment[] arr) {
        Segment ans = arr[0];

        for(int i=1;i<arr.length;i++) {
            if(ans.length() > arr[i].length()) {
                ans = arr[i];
            }
        }

        int countOfMinimumLengthSegments = 0;

        for(int i=0;i<arr.length;i++) {
            if(ans.length() == arr[i].length()) {
                countOfMinimumLengthSegments++;
            }
        }

        Segment[] result = new Segment[countOfMinimumLengthSegments];
        int j = 0;

        for(int i=0;i<arr.length;i++) {
            if(ans.length() == arr[i].length()) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for(int i=0;i<n;i++) {
            System.out.println("- - - - - - - - -");
            System.out.println("Segment no: " + i);
            System.out.print("x1 = ");
            float x1 = scanner.nextFloat();
            System.out.print("y1 = ");
            float y1 = scanner.nextFloat();
            System.out.print("x2 = ");
            float x2 = scanner.nextFloat();
            System.out.print("y2 = ");
            float y2 = scanner.nextFloat();
            segments[i] = new Segment(x1,y1,x2,y2);
        }
        Segment[] answer = getAllAnswers(segments);
        if(answer.length == 1) {
            System.out.println("There is only 1 such segment: " + answer[0]);
        }
        else {
            System.out.println("There are " + answer.length + " such segments:");
            for(Segment segment : answer) {
                System.out.println(segment.toString());
            }
        }
    }
}
