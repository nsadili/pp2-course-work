public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return (rect.width == this.width && rect.height == this.height);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(15, 10);
        Rectangle rect3 = new Rectangle(5, 10);

        System.out.println(rect1.equals(rect2)); 
        System.out.println(rect1.equals(rect3));
    }
}
