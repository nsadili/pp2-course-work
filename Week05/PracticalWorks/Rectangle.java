package Week05.PracticalWorks;

public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        return rect.height == this.height && rect.width == this.width;

    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5,10);
        Rectangle  r2=new Rectangle(15,10);
        Rectangle r3=new Rectangle(5,10);
        System.out.println(r1.equals(r2)); //false
        System.out.println(r1.equals(r3)); //true
    }
}
