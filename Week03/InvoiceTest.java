public class InvoiceTest {
    public static void main(String[] args) {
        Invoice p1 = new Invoice("Prd4", "Bread", 3, 4.00);
        System.out.printf("%s, %s, %d, %.2f, %.2f", p1.getPartNumber(), p1.getPartDescription(), p1.getQuantity(),
                p1.getPricePerItem(), p1.getPaymentAmount());
    }
}
