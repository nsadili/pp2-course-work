class Rectangle {
    int width,height;

    public Rectangle(int w,int h) {
        width=w;
        height=h;
    }

    public boolean equals(Object obj) {
        Rectangle rect=(Rectangle)obj;

        if(this.height==rect.height && this.width==rect.width) return true;
        else return false;
    }
}
class Square extends Rectangle {
    public Square(int s) {
        super(s, s);
    }
}

public class HW1 {
    public static void main(String args[]) {
        Rectangle rc1=new Rectangle(10, 5);
        Rectangle rc2=new Rectangle(15, 10);
        Rectangle rc3=new Rectangle(10, 5);

        System.out.println(rc1.equals(rc3));
        System.out.println(rc1.equals(rc2));

        Object o1=new Rectangle(10, 5);
        Object o2= new Rectangle(10, 10);
        Object o3= new Square(10);
        System.out.println(o1.equals(o2));
        System.out.println(o3.equals(o2));

    }
}
