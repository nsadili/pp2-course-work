package Week05.PW.Ex11;

public class Rectangle {
    private int width, height;
    
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle) obj;
            return (rect.width == this.width) && (rect.height == this.height);
        }
        return false;
    }


}
