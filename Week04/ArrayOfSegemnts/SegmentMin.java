package ArrayOfSegemnts;

public class SegmentMin {
    public static void main(String[] args) {
        Segment[] segm = new Segment[] {
                new Segment(3, 5, 6, 7),
                new Segment(6, 7, 8, 9),
                new Segment(0, 0, 1, 1),
                new Segment(1, 1, 2, 2),
        };
        toString(checkAndBuildNewSegment(segm));
    }

    public static Segment[] checkAndBuildNewSegment(Segment[] segm) {
        Segment[] alfa = new Segment[check(segm)];
        for (int i = 0, g = 0; i < segm.length; i++) {
            if (findMin(segm) == segm[i].getDistances()) {
                alfa[g++] = segm[i];
            }
        }
        return alfa;
    }

    public static double findMin(Segment segm[]) {
        double min = 1000;
        for (int i = 0; i < segm.length; i++) {
            if (segm[i].getDistances() < min)
                min = segm[i].getDistances();
        }
        return min;
    }

    public static void toString(Segment[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(
                    "[(" + x[i].getX1() + "," + x[i].getY1() + "):(" + x[i].getX2() + ":" + x[i].getY2() + ")]");
        }
    }

    public static int check(Segment[] segm) {
        int g = 0;
        for (int i = 0; i < segm.length; i++) {
            if (findMin(segm) == segm[i].getDistances()) {
                g++;
            }
        }
        return g;
    }
}
