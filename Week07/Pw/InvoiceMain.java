package Pw;

public class InvoiceMain {

    public static void main(String[] args) {
        try{
            Invoice i = new Invoice("211","FrontHeadLight",-1,-200);
            i.toString();
        }catch(IllegalArgumentException e){
            System.out.println(  "Problem" + e.getMessage());
        }



    }
}
