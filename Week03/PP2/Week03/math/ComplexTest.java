public class ComplexTest {
    public static void main(String[] args) throws Exception {
        ComplexNumber user1 = new ComplexNumber(2.4, 3.3);
        ComplexNumber user2 = new ComplexNumber(4.4, 0);
        ComplexNumber user3 = new ComplexNumber(0, -5.5);

        System.out.println(user1.conjugate());
        System.out.println(user2.conjugate());
        System.out.println(user3.conjugate());

        System.out.println(user1.abs());
        System.out.println(user2.abs());
        System.out.println(user3.abs());

        System.out.println(user1.add(user2));
        System.out.println(user2.add(user1));
       

        System.out.println(user1.sub(user2));
        System.out.println(user2.sub(user1));
        

        System.out.println(user1.mult(user3));
        System.out.println(user2.mult(user2));
        System.out.println(user3.mult(user1));


        
    }
}
