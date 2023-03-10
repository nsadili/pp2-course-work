import Invoice.Invoice;

public  class  InvoiceTest {
    public static void main(String[] args) {
        try{
        Invoice i= new Invoice("42325", "Apple Macbook Air 13", 475, -90);
        //i=invoice (I try to avoid repetition)
        System.out.println("Part Number - " + i.getNumber());
        System.out.println("Part Description - " + i.getDescription());
        System.out.println("The quantity - " + i.getQuantity());
        System.out.println("Price per item - " + i.getPrice());
        System.out.println("Invoice amount - " + i.getInvoiceAmount());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        

}
}

