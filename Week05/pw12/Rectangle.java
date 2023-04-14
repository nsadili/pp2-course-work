package WEEK5.pw12;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj){
        Rectangle rect=(Rectangle) obj;
        if(rect.width==this.width && rect.height==this.height) return true;
        else return false;
        
    }
}
