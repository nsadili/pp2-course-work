package W7Ex3;

public class InvoiceTest {
    public static void main(String[] args){
        try {
            Invoice a = new Invoice("1", "chair", 10, -9.99);
            double overallAmount = a.getInvoiceAmount();
            System.out.println(overallAmount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}