public class MainInvoice {
    public static void main(String[] args) {
        try{
            Invoice i = new Invoice("Alfa","Beta",19,-9);
            i.toString();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

       System.out.println("2nd attempt");


        try{
            Invoice i = new Invoice("Alfa","Beta",19,9);
            System.out.println(i.toString());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        }
}