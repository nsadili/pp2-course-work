public class Rectangle2 implements Cloneable {
    private int width;
    private int height;

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle2 clone() throws CloneNotSupportedException {
        return (Rectangle2) super.clone();
    }

}
