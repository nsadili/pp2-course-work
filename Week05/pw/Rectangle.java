public class Rectangle {
        

    private int width, height;
    
    public Rectangle(int w,int h)
    {
        width=w;  height=h;
    }

    public boolean equals(Object X)
    {
      Rectangle rect= (Rectangle) X;

    return rect.width==this.width && rect.height==this.height;

    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3, 6);
        Rectangle r2=new Rectangle(9, 6);
        Rectangle r3=new Rectangle(3, 6);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));


    }


}
