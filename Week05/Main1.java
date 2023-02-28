public class Main1 {
    public static void main(String[] args) {
        Object obj1 = new Rectangle(5, 10);
        Object obj2 = new Rectangle(15, 15);
        Object obj3 = new Square(15);
        
        System.out.println("Objects are identical: " + obj1.equals(obj2));
        System.out.println("Objects are identical: " + obj1.equals(obj3));
        System.out.println("Objects are identical: " + obj2.equals(obj3));
    }
}
