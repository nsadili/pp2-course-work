package Week04;

import java.util.ArrayList;

class Point {
    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Arrayofpoint {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(2, 3));
        points.add(new Point(-1, 5));
        points.add(new Point(0, 0));
        points.add(new Point(4, 1));
        points.add(new Point(-2, -4));
        
        Point northern = points.get(0);
        Point southern = points.get(0);
        Point western = points.get(0);
        Point eastern = points.get(0);
        
        for (int i = 1; i < points.size(); i++) {
            Point current = points.get(i);
            if (current.y > northern.y) {
                northern = current;
            }
            if (current.y < southern.y) {
                southern = current;
            }
            if (current.x < western.x) {
                western = current;
            }
            if (current.x > eastern.x) {
                eastern = current;
            }
        }
        
        System.out.println("Northern point: (" + northern.x + ", " + northern.y + ")");
        System.out.println("Southern point: (" + southern.x + ", " + southern.y + ")");
        System.out.println("Western point: (" + western.x + ", " + western.y + ")");
        System.out.println("Eastern point: (" + eastern.x + ", " + eastern.y + ")");
    }
}
