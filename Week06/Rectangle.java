class Rectangle{
    int width, height;
    public Rectangle(int w, int h){
        width=w;height=h;
    }
    public boolean equals(Object obj) {
        Rectangle rect=(Rectangle) obj;
       // Rectangle r1=new Rectangle(5,10);
        //Rectangle r2=new Rectangle(15,10);
        //Rectangle r3=new Rectangle(5,10);
       
      //  System.out.println(r1.equals(r2));
        //System.out.println(r1.equals(r3));
        if (obj == this) {
            return true;
            }
            
            if (!(obj instanceof Rectangle)) {
            return false;
            }
    }
    
}
class Square extends Rectangle{
    int side;
    public Square(int r) {
        side=r;
    }
    public boolean equals(Object obj){
    Object o1=new Rectangle(5,10);
    Object o2=new Rectangle(15,15);
    Object o3= new Square(15);
    System.out.println("Objects are identical: " +o1.equals(o2));
    System.out.println("Objects are identical: " +o1.equals(o3));
    System.out.println("Objects are identical: " +o2.equals(o3));
    }

}