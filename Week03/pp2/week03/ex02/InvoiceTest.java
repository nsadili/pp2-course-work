package pp2.week03.ex02;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice one = new Invoice("C0424", "Candy", 100, 0);
        System.out.println("part number: " + one.getPartNum() + "  part description:" + one.getPartDes() +
                "  quantity of purchased: " + one.getQuantityPurch() + "  price: " + one.getPriceItem() + "  invoice amount: " +
                one.getInvoiceAmount());

    }
}
