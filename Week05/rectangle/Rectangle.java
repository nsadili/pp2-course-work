package Week05.rectangle;
import java.util.Objects;
public class Rectangle {
    int width, height;
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        if (rect != obj ) return false;
        if (this.getClass() != obj.getClass()) return false;
        return Objects.equals(width, rect.width) && Objects.equals(height, rect.height);

    }
}
    class Square extends Rectangle{
        int side;
        public Square(int side){
            super(side, side);
        }
        
    }
    
