import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);



        String input = sc.next();
        
        for (int i = 1; i < input.length(); i++) {
            
            String slice1 = input.substring(0, i);

            String slice2 = input.substring(i);
            
            System.out.println(slice1 + " " + slice2);
        }
        
        System.out.println(input);
        
        sc.close();
    }
}
    