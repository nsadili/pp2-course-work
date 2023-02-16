import pp2.week03.ex02.*;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice x= new Invoice("2393289","product",10,59.99);
        System.out.printf("Product Number: %s, Quantity: %d, Price: %.2f manat",x.getNo(),x.getQuantity(), x.getInvoiceAmount());
    }
    
}
