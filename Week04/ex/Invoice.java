public class Invoice {
   
        private int quantity;
        private double price;
        
        public Invoice(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
        }
        
        public double getAmount() {
        return quantity * price;
        }
        
        public static void main(String[] args) {
        Invoice[] invoices = {
        new Invoice(10, 5),
        new Invoice(5, 2.5),
        new Invoice(2, 7)
        };
        
        for (int i = 0; i < invoices.length; i++) {
        Invoice invoice = invoices[i];
        double amount = invoice.getAmount();
        System.out.println("Invoice " + (i + 1) + " Amount: $" + amount);
        }
        }
 }

