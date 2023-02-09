package Week03;

public class Main {
    public static void main(String [] args){
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);

        Point p1 = new Point(2.0f, 3.0f);
        Point p2 = new Point(x, y );
        
        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p1.getY() + ")");
        System.out.println(" Are point 1  and point 2 equal? ",  + p1.equals(p2));

        p1.translate(1.0f, 1.0f);
    }
}
