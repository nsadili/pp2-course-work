package ex0;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 7);
        System.out.println(r1.width);
        System.out.println(r1.height);
    }
}