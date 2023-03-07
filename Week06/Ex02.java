public class Ex02{
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
    }