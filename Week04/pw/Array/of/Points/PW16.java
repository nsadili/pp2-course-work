package Array.of.Points;

public class PW16 {
    public static void main(String[] args) {
        Points[] points = {new Points(1, 2), new Points(5, 4), new Points(-3, 6),
                          new Points(0, -2), new Points(-5, -4)};

        Points northern = points[0];
        Points southern = points[0];
        Points western = points[0];
        Points eastern = points[0];

        for (int i = 1; i < points.length; i++) {
            Points p = points[i];
            if (p.y < northern.y) {
                northern = p;
            }
            if (p.y > southern.y) {
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

