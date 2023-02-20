import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
         
           for(int i = 1; i < word.length(); i++){
            String beginIndex = word.substring(0, i);
            String endIndex = word.substring(i, word.length());
           
           System.out.println(beginIndex + " " + endIndex);
        }
       
    }
        
    }

