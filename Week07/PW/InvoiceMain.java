package Week07.PW;

public class InvoiceMain {
    public static void main(String[] args) {
        //Invoice A = new Invoice("15", "good" , -20 , 50);
        //System.out.println(A.getInvoiceAmount());

        try {
            Invoice A = new Invoice("15", "good" , -20 , 50);
            System.out.println(A.getInvoiceAmount());
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        
    }
    
}
