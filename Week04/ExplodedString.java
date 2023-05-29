import java.util.Scanner;

public class ExplodedString {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase, enter the input: ");
        String input = sc.nextLine();
        sc.close(); 

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++) { 
            for(int j = 0; j <= i; j++) {
                sb.append(input.charAt(j));
            }
        }
        System.out.println(sb.toString());
    }
}