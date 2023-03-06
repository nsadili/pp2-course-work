package Week06;

public class Rectangle implements Cloneable {
    int width = 1;
    int height = 1;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj; 
        return this.width == rect.width && this.height == rect.height;
    }

    // Object is the superclass of all classes in Java,
    // that is why protected specifier before the clone() can be used.
    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

}
