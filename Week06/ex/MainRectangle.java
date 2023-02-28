public class MainRectangle {
public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5,10);
    Rectangle r2 = new Rectangle(15,10);
    Rectangle r3 = new Rectangle(5,10);
    System.out.println(r1.equals(r2));
    System.out.println(r1.equals(r3));

    System.out.println();

    Object o1 = new Rectangle(5,10);
    Object o2 = new Rectangle(15,15);
    Object o3 = new Square(15, 15, 15); // why I cannot Square (15) ???
    System.out.println("Objects are identical: "+ o1.equals(o2));
    System.out.println("Objects are identical: "+ o1.equals(o3));
    System.out.println("Objects are identical: "+ o2.equals(o3));

}    
}
