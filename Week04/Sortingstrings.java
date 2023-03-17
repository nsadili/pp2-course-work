package week04;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Sortingstrings {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        Sort(string);
    }
       public static void Sort(String string)
       { 
        char m[] = string.toCharArray();
        char temp;
        for (int i =0 ; i<string.length(); i++){
            for (int j =0 ;j<string.length(); j++){
                if ( m[i] < m[j]){

                 temp = m[i];
                 m[i] = m[j]; 
                 m[j] = temp;
                }

        }
    }
             System.out.println(new String(m));
}
    

}