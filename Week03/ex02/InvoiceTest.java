package Week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("1", "test1", 2, 4.2);
        Invoice inv2 = new Invoice("2", "test2", -3, -1);
        System.out.println(inv1.getPartDescription());
        System.out.println(inv2.getItemQuantity());
        System.out.println(inv2.getItemPrice());
        inv2.setItemPrice(92.11);
        System.out.println(inv2.getItemPrice());
        inv2.setItemQuantity(3);
        System.out.println(inv2.getInvoiceAmount());
        try {
            // inv1.setItemPrice(-9);
            inv1.setItemQuantity(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
