import java.util.Scanner;

// import Invoice.*;

public class EX3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Invoice x= new Invoice();
        
        x.quantity=scan.nextInt();
        x.price=scan.nextDouble();

        try{
            if (x.getQuantity() < 0) {
                throw new IllegalArgumentException("Quantity must be positive.");
            }
        } 
        catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
        
        try{
            if (x.getPrice() < 0) {
                throw new IllegalArgumentException("Price must be positive.");
            }
        } 
        catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

}

