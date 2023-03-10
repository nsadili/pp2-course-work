public class invoice {
        private String Number;
        private String Description;
        private int quantity;
        private double price;
    
        public invoice(String Number, String Description, int quantity, double price) {
            setNumber(Number);
            setDescription(Description);
            setQuantity(quantity);
            setPrice(price);
        }
    
        public void setNumber(String Number) {
            this.Number = Number;
        }
    
        public void setDescription(String Description) {
            this.Description = Description;
        }
    
        public void setQuantity(int quantity) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative.");
            }
            this.quantity = quantity;
        }
    
        public void setPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
        }
    
        public double getInvoiceAmount() {
            return quantity * price;
        }

        public static void main(String[] args) {
            try {
                invoice invoice = new invoice("123", "Widget", 5, 10.0);
                System.out.printf("Total amount: %.2f\n", invoice.getInvoiceAmount());
    
                invoice.setQuantity(-2);
                System.out.printf("Total amount: %.2f\n", invoice.getInvoiceAmount()); 
    
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
}
    
    