package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args){
       Invoice a = new Invoice("1", "chair", 10, 9.99); 
       double overallAmount = a.getInvoiceAmount();
       System.out.println(overallAmount);
    }
}
