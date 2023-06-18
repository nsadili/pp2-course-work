package Week07;

import Week07.Ex3.Invoice;

public class Ex3Test {
    
    public class InvoiceTest {
        public static void main(String[] args) {
            Invoice invoice = new Invoice("1.", "Bananas", 8, 4.5);
    
            System.out.println("We have sold " + invoice.getQuantity() + " " + invoice.getDescription() + "!");
    
            invoice.setDescription("Ananas");
            invoice.setQuantity(10);
    
            System.out.println("We have sold " + invoice.getQuantity() + " " + invoice.getDescription() + "!");
    
            System.out.println("Our overall income is " + invoice.getInvoiceAmount() + " manat.");
        }
    }
}
