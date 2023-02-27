class Rectangle {
    int width, height;

    public Rectangle(int w,int h) {
        this.width=w;
        this.height=h;
    }

    public boolean equals(Object obj) {
        Rectangle rec = (Rectangle) obj;
        if(this.height==rec.height && this.width==rec.width) return true;
        else return false;
    }
}

class Square extends Rectangle {
    
    public Square(int s) {
        super(s,s);
    }


}

public class Equals {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5,10);
        Rectangle r2=new Rectangle(15, 15);
        Rectangle r3=new Square(15);

        System.out.println("Objects are identical: "+r1.equals(r2));
        System.out.println("Objects are identical: "+r1.equals(r3));
        System.out.println("Objects are identical: "+r2.equals(r3));


    }
    
}
