package EX;
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle rect= (Rectangle) obj;
        return this.width==rect.width && this.height==rect.height;
    
    }
}  

    

