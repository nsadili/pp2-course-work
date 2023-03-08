public class Rectangle implements Cloneable {
    private int width, height;

    public Rectangle(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }

    public String toString() 
    {
        return width + " " + height;
    }

    public void set(int width, int height) {

        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        if (obj == this) 
        {
            return true;
        }
        if (obj.getClass() != getClass())
         {
            return false;
        }
        Rectangle that = (Rectangle) obj;
        return this.width == that.width && this.height == that.height;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}