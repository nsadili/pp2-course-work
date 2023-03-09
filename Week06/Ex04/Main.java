package Week06.Ex04;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = r1.clone();

        System.out.println(r1.equals(r2));
        System.out.println(r1 == r2);
    }
    
}
