import java.util.Scanner;

import javax.swing.InputMap;

public class ExplodedString {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaase, enter the input: ");
        String input = sc.nextLine();
        sc.close(); 
        /* Closes the Scanner objec, 
        after the input has been read, 
        so that system resources are properly released  */ 

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++) { 
            /* iterates each character in the input string */
            for(int j = 0; j <= i; j++) {
                sb.append(input.charAt(j));
            }
        }
        System.out.println(sb.toString());
    }
}
