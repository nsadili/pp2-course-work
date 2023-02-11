import pp2.week03.ex02.Invoice;
public  class  InvoiceTest {
    public static void main(String[] args) {
        Invoice i= new Invoice("42325", "Apple Macbook Air 13", 4, 3075.0);
        //i=invoice (I try to avoid repetition)
        System.out.println("Part Number - " + i.getNumber());
        System.out.println("Part Description - " + i.getDescription());
        System.out.println("The quanity - " + i.getQuantity());
        System.out.println("Price per item - " + i.getPrice());
        System.out.println("Invoice amount - " + i.getInvoiceAmount());





    }

    
}
