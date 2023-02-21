package pp2.week04;

public class ArrayOfPoints {

    public static class MyPoint {
        public int x;
        public int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "MyPoint{" + "x=" + x + ", y=" + y + '}';
        }
    }

    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[4];
        points[0] = new MyPoint(1, 2);
        points[1] = new MyPoint(3, 4);
        points[2] = new MyPoint(-1, 5);
        points[3] = new MyPoint(0, -2);
        analyzePoints(points);
    }

    public static void analyzePoints(MyPoint[] points) {
        MyPoint northern = points[0];
        MyPoint southern = points[0];
        MyPoint western = points[0];
        MyPoint eastern = points[0];

        for (MyPoint p : points) {
            if (p.y > northern.y) {
                northern = p;
            }
            if (p.y < southern.y) {
                southern = p;
            }
            if (p.x < western.x) {
                western = p;
            }
            if (p.x > eastern.x) {
                eastern = p;
            }
        }

        System.out.println("Northernmost point: " + northern);
        System.out.println("Southernmost point: " + southern);
        System.out.println("Westernmost point: " + western);
        System.out.println("Easternmost point: " + eastern);
    }
}
