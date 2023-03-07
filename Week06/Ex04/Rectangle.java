package Ex04;

public class Rectangle implements Cloneable {
    int width, height;
    public Rectangle(int w, int h){
        width= w;
        height=h;
    }
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle rect= (Rectangle) obj;
        return this.width==rect.width && this.height==rect.height;
    
}
@Override
public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
}