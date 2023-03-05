
public class Rectangle implements Cloneable {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public String toString() {
        return width + " " + height;
    }

    public void set(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public boolean equals(Object obj) {
        if(obj == null)
        return false;

        if(!(obj instanceof Rectangle)) 
        return false;
        
        Rectangle that = (Rectangle) obj;

        return this.width == that.width && this.height == that.height;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}


