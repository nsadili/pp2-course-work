public class InvoiceTest {
    public static void main(String[] args){
       Invoice i1 = new Invoice("11", "hello", 5, 10.5);

       System.out.printf("%s, %s, %d, %f\n", i1.getPn(), i1.getPd(), i1.getQ(), i1.getPr());
       System.out.printf("%f\n", i1.getInvoiceAmount());

    }
    
}
