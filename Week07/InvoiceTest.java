public class InvoiceTest {
    public static void main(String[] args) throws Exception {
        Invoice i = new Invoice("two", "new", -7, -8.9);

        System.out.println(i.getPartNum());
        System.out.println(i.getPartDescrb());

        try {
            System.out.println(i.getQuantity());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(i.getPrice());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(i.getInvoiceAmount());

    }
    
    // WHY IT DOESNT CHECK QUANTITY, ONLY PRICE?

}