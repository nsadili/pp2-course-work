package Week06.ex3;

public class Rectangle {
    int width,height;
    public Rectangle(int w,int h){
        width=w;
        height=h;

    }
    public boolean equals(Object obj){
        Rectangle rec=(Rectangle) obj;
        if(this.width==rec.width && this.height==rec.height) return true;else return false;
    }
}
