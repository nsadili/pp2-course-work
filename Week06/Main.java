package Week06;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r = new Rectangle(2, 5);
        Rectangle r2 = (Rectangle)r.clone();
        r2.width = 4;
        System.out.println(r.width);
    }
}
