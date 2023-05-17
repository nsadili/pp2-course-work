package Week06;

public  class Rectangle {
    int width, height;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

  @Override
    public boolean equals(Object obj){
        Rectangle rectangle = (Rectangle) obj;
        if (rectangle.width == this.width && rectangle.height == this.height) return true;
        else return false;
    }
}