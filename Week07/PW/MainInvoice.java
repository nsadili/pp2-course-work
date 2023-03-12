
public class MainInvoice {
    public static void main(String[] args) {
        try{
            Invoice i = new Invoice("123","Phone",50,-675);
            i.toString();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

       System.out.println("2nd attempt");
        try{
            Invoice i = new Invoice("123","Phone",50,675);
            System.out.println(i.toString());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
