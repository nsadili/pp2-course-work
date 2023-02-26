public class Rectangle {
    private int width;
    private int height;

    public Rectangle (int w, int h){
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        if(obj == null){
            return false;
        }else{
            return rect.width == width && rect.height == height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}