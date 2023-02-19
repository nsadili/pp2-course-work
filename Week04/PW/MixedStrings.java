import java.util.Scanner;
public class MixedStrings {
    public static void main (String [] args ){
      
      Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] qutu = text.split(" ");
        for(String word : qutu){
            char[] a = word.toCharArray();
            for(int k=a.length-1; k>=0; k--){
                System.out.print(a[k]);
            }
            System.out.print(" ");
        }

     
    }
}





