package Week05;

public class Rectangle{
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        if(this.width == rect.width && this.height == rect.height) return true;
        return false;
    }
}
