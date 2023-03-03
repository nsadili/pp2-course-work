public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj){
        Rectangle rec = (Rectangle) obj;
        if(rec.width == this.width && rec.height == this.height){
            return true;
        }else{
            return false;
        }

    }
}
