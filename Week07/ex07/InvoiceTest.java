public class InvoiceTest {
    public static void main(String[] args) throws Exception {
        try {
            Invoice i = new Invoice(null, null, 0, 0);
            System.out.println(i.getQuan());

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Invoice i = new Invoice(null, null, 0, 0);
            System.out.println(i.getPrice());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}