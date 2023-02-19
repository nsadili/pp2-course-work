import java.util.Scanner;
public class Slices {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word);
        for(int k=1; k<word.length(); k++){
            System.out.println(word.substring(0,k)+" "+word.substring(k));
        }
     
    }
    
}





