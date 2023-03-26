package pp2.week03.ex02;

public class Test1 {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("912783", "item1", 1, 0.99);
        Invoice invoice2 = new Invoice("921873", "item2", -1, -0.99);

        System.out.println("Invoice 1:");
        System.out.println("Part number is " + invoice1.getPartnum());
        System.out.println("Part description is " + invoice1.getPartdesc());
        System.out.println("Quantity is " + invoice1.getQuantity());
        System.out.println("Price per item is " + invoice1.getPPI());
        System.out.println("Invoice amount is " + invoice1.getInvoiceAmount());

        System.out.println();

        System.out.println("Invoice 2:");
        System.out.println("Part number is " + invoice2.getPartnum());
        System.out.println("Part description is " + invoice2.getPartdesc());
        System.out.println("Quantity is " + invoice2.getQuantity());
        System.out.println("Price per item is " + invoice2.getPPI());
        System.out.println("Invoice amount is " + invoice2.getInvoiceAmount());

        invoice1.setPartnum("000000");
        invoice2.setPartdesc("non-existing item");

        System.out.println();

        System.out.println("New part number is " + invoice1.getPartnum());
        System.out.println("New part description is " + invoice2.getPartdesc());
    }
}