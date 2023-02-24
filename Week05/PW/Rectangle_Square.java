package PW;




public class Rectangle {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 15);
        Rectangle r3 = new Rectangle(5, 10);
        Square r4 = new Square(15);
        System.out.println("Objects are identical: "+r1.equals(r2));
        System.out.println("Objects are identical: "+r1.equals(r3));
        System.out.println("Objects are identical: "+r1.equals(r4));
        System.out.println("Objects are identical: "+r2.equals(r4));


    }
    
    
    int width, height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        return rect.height==this.height && rect.width==this.width;
   }
}
   class Square extends Rectangle{
    int side;
    public Square(int side){
        super(side,side);
    }
   }

