public class Invoiceclass{

    private int quantity;
    private static double price;

public void Invoice( int quantity, double price) {

    setQuantity(quantity);
    setPrice(price);
}  
    public int getQuantity() {
        return quantity;
    }
    /**
     * @param quantity
     */
    public void setQuantity(in
    t quantity) {
        this.quantity = (quantity > 0) ? quantity :0;
    }

    public double getPrice() {
        return price;
        }
        public void setPrice(double price) {
            this.price = (price > 0) ? price : 0.0;
        }
        public double getInvoiceAmount() {
            return quantity * price;
        }
        /**
         * @param args
         */
        public static void main (String args[]) {
            try {
                System.out.printf("%d", price);
            }
            catch(IllegalArgumentException s){
                System.out.println(s.getMessage());
            }
                catch(Exception s) {
                    System.out.println(s.getMessage());
                }
            /**
             * @param price
             */
            public static void setPrice(double price) {

                if (price < 0) {
                    throw new IllegalArgumentException("Price must be greater than zero");
                } else {
                  this.price = price;
                }
                /**
                 * @param quantity
                 */
                public static void setQuantity(int quantity)
                {
                    if (quantity < 0) {
                        throw new IllegalArgumentException("Quantity must be greater than zero");
                    } else {
                      this.quantity = quantity;
    
                    }
                }
        }
