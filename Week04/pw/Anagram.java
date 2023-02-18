import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String input1 = scan.nextLine();
       String input2 = scan.nextLine();
    
        if(input1.length() == input2.length()){

        
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();
        
        int k = chars1.length;
        for (int i = 0; i < k - 1; i++) {
             for (int j = i + 1; j < k; j++) {
                 if (chars1[i] > chars1[j]) {
                     char tmp = chars1[i];
                     chars1[i] = chars1[j];
                     chars1[j] = tmp;
                 }
                 if (chars2[i] > chars2[j]) {
                    char tmp = chars2[i];
                    chars2[i] = chars2[j];
                    chars2[j] = tmp;
                 }
            }
        }
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                System.out.println("false");
                return;
            }
        }
    
        
        System.out.println(true);
    }
       
    }
        }
        
    


