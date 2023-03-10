public class InvoiceTest {
    public static void main(String[] args) throws Exception {
        try {
            Invoice i = new Invoice("two", "new", -7, -8.9);
            System.out.println(i.getQuantity());

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        try {
            Invoice i = new Invoice("two", "new", -7, -8.9);
            System.out.println(i.getPrice());

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }

}