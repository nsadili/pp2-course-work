package Rectangle;
public class Rectangle extends Shape implements Cloneable, Resizable{
    protected double width = 1.0;
    protected double height = 1.0;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

   

    
    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        if (this.width == rect.width && this.height == rect.height)
            return true;
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Resizable resize() {
        throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }
    
}