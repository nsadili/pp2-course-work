package PackageFolder;

public class TestApp {
    public static void main(String[] args){
       Invoice Prod = new Invoice("SRT5609", "Tire", 14, 65.0);
       System.out.println(Prod.getPartNumber());
       System.out.println(Prod.getInvoiceAmount());
    }
}
