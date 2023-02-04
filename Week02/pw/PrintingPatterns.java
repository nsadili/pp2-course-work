import java.util.Scanner; // works

public class PrintingPatterns {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int size = sc.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if((j + i) % 2 == 0){ // if the sum is even, print *; otherwise, #
                    System.out.print("*");
            } else {
              System.out.print("#");
                   }
            } 
            System.out.println(); // necessary

        }
    }
    
}
    

