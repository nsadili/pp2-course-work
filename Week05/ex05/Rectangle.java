public class Rectangle {
    int height, width;

    public Rectangle (int h, int w)
    {
        this.height = h;
        this.width = w;

    }

    public boolean equals (Object obj)
    {
        if(obj insteanceOf Rectangle)
        {
            Rectangle rect =  (Rectangle) obj;
            return rect.height == this.height && rect.width == this.width;
        }

        return false;
    }
}
