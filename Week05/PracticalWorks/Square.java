package Week05.PracticalWorks;



public class Square extends Rectangle{
    public Square(int side) {
        super(side,side);
    }

    public static void main(String[] args) {
        Object o1=new Rectangle(5,10);
        Object o2=new Rectangle(15,15);
        Object o3=new Square(15);
        System.out.println("Objects are identical: "+o1.equals(o2)); //Objects are identical: false
//        System.out.println("Objects are identical: "+o1.equals(03)); without this line, code works great, i think beacuse of casting in rectangle class(line12), it gives me error. After acknowledging casting i will be back on this code.
        System.out.println("Objects are identical: "+o2.equals(o3)); //Objects are identical: true
    }
}
