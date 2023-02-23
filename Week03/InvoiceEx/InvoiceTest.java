package Week03.InvoiceEx;

public class  InvoiceTest{
    public static void main(String[] args) {
        Invoice first = new Invoice(50 , "12", "Store", 2.5);
        System.out.println(first.getInvoiceAmount());
    }
}
