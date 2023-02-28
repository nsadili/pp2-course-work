public class Rectangle {
    private int width;
    private int height;

    public Rectangle (int w, int h){
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object o){
        Rectangle rec = (Rectangle) o;
        if(o == null){
            return false;
        }else{
            return rec.width == width && rec.height == height;
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