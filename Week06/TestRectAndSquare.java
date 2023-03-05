public class TestRectAndSquare {

    int a,b;
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = new Rectangle(5, 5);
        Rectangle r3 = new Rectangle(2, 5);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        Object o1 = new Rectangle(2, 5);
        Object o2 = new Rectangle(3, 3);
        Object o3 = new Square(3);
        Object o4 = new Square(5);

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o2.equals(o3));
        System.out.println(o4.equals(r2));

        Rectangle copy= (Rectangle) r3.clone();
        
        


        System.out.println(copy.toString());
        copy.set(0, 0);
        System.out.println(copy + "----" + r3);
        

    }


    public void foo() throws CloneNotSupportedException{
        this.clone(); // it use TestRectAndSquare class clone method
    }
}
