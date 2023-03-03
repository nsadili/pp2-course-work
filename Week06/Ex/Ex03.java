public class Ex03 {
    public static void main(String[] args) {
        Object o1= new Rectangle(5,10);
        Object o2= new Rectangle(15,15);
        Object o3= new Square(15);
        System.out.println("Objects are identical: " + o1.equals(o2));// it is false
        System.out.println("Objects are identical: "+o1.equals(o3));// it is false
        System.out.println("Objects are identical: "+o2.equals(o3));// it is true

        
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
class Square extends Rectangle{
    public Square(int sideSize){
        super(sideSize, sideSize);
    }
}