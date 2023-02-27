public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(5,10);
        Rectangle r2= new Rectangle(15,10);
        Rectangle r3= new Rectangle(5, 10);
        System.out.println(r1.equals(r2));// it is false
        System.out.println(r1.equals(r3));// it is true
        
    }
}
class Rectangle{
    int width, height;
    public Rectangle(int w, int h){
        width=w;
        height=h;
    }
    public boolean equals(Object obj){
        Rectangle rect=(Rectangle) obj;
        if(this.width==rect.width && this.height== rect.height){
            return true;
        } else {
            return false;
        }
    }
}