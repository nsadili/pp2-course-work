package Week04.ex16;

class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}

public class ArrayOfPoints {
    public static void main(String[] args) {
        Point[] points = {new Point(0, 0), new Point(3, 4), new Point(-1, 2)};
        
        Point northern = points[0];
        Point southern = points[0];
        Point western = points[0];
        Point eastern = points[0];
        
        for (int i = 1; i < points.length; i++) {
            Point p = points[i];
            
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
        
        System.out.println("Northern point: (" + northern.getX() + ", " + northern.getY() + ")");
        System.out.println("Southern point: (" + southern.getX() + ", " + southern.getY() + ")");
        System.out.println("Western point: (" + western.getX() + ", " + western.getY() + ")");
        System.out.println("Eastern point: (" + eastern.getX() + ", " + eastern.getY() + ")");
    }
}
