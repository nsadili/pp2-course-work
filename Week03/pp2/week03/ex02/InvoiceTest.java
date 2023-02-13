
package pp2.week03.ex02;
public class InvoiceTest {    public static void main(String[] args) {
    Invoice test = new Invoice("57CT", "Cat Toy", 100, 2);
    System.out.println("Part number: " + test.getNumPart() + " Part description:" + test.getDescPart() +
            " Quantity of purchased parts: " + test.getQuantity() +
            " Price of parts: " + test.getPrice() +
            " Invoice amount: " + test.getInvoiceAmount());
}
}
