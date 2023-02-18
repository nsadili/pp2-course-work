import java.util.Scanner;

class Segment {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Segment(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class ArrayofSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of segments: ");
        int n = sc.nextInt();
        sc.nextLine();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Segment " + (i + 1) + ":");
            System.out.println("X1: ");
            int x1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Y1: ");
            int y1 = sc.nextInt();
            sc.nextLine();
            System.out.println("X2: ");
            int x2 = sc.nextInt();
            sc.nextLine();
            System.out.println("Y2: ");
            int y2 = sc.nextInt();
            sc.nextLine();
            segments[i] = new Segment(x1, y1, x2, y2);
        }
        Segment[] shortest = getShortest(segments);
        for (int i = 0; i < shortest.length; i++) {
            System.out.println("Shortest Segment " + (i + 1) + ":");
            System.out.println("X1: " + shortest[i].getX1());
            System.out.println("Y1: " + shortest[i].getY1());
            System.out.println("X2: " + shortest[i].getX2());
            System.out.println("Y2: " + shortest[i].getY2());
        }
    }

    public static Segment[] getShortest(Segment[] segments) {
        double shortest = segments[0].getLength();
        int count = 0;
        for (int i = 0; i < segments.length; i++) {
            if (segments[i].getLength() < shortest) {
                shortest = segments[i].getLength();
                count = 1;
            } else if (segments[i].getLength() == shortest) {
                count++;
            }
        }
        Segment[] shortestSegments = new Segment[count];
        int index = 0;
        for (int i = 0; i < segments.length; i++) {
            if (segments[i].getLength() == shortest) {
                shortestSegments[index] = segments[i];
                index++;
            }
        }
        return shortestSegments;
    }
}

