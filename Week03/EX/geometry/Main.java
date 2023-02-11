package EX.geometry;

public class Main {
    public static void main(String[] args) {
        
        Point p1 = new Point();
        Point p2 = new Point(3, 5);
        // you can store integer variable in float but not vise versa

        Segment s = new Segment(p1, p2);
        System.out.printf("p1: (%f, %f), p2: (%f, %f)\n",
        s.getP1().getX(), s.getP1().getY(), s.getP2().getX(), s.getP2().getY());
    }
}
