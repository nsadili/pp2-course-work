package Week06;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p = new Point(2, 5);
        p.moveUp();
        System.out.println(p.getY());
    }
}
