package Week04.PW;


import java.util.Scanner;


public class EX16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of points you want to enter: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Ok, bye");
            return;
        }
        Point[] pts = new Point[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Point #" + (i + 1));
            System.out.print("Please enter the X coordinate: ");
            float x = sc.nextFloat();
            System.out.print("Please enter the Y coordinate: ");
            float y = sc.nextFloat();
            pts[i] = new Point(x, y);
        }
        findExtremePoints(pts);
    }

    public static void findExtremePoints(Point[] pts) {
        Point northern = pts[0], southern = pts[0], western = pts[0], eastern = pts[0];
        for (Point p : pts) {
            if (p.getY() > northern.getY()) {
                northern = p;
            }
            if (p.getY() < southern.getY()) {
                southern = p;
            }
            if (p.getX() < western.getX()) {
                western = p;
            }
            if (p.getX() > eastern.getX()) {
                eastern = p;
            }
        }
        System.out.printf("Northern: ( %f, %f )\n", northern.getX(), northern.getY());
        System.out.printf("Southern: ( %f, %f )\n", southern.getX(), southern.getY());
        System.out.printf("Western: ( %f, %f )\n", western.getX(), western.getY());
        System.out.printf("Eastern: ( %f, %f )\n", eastern.getX(), eastern.getY());
    }
    
}
