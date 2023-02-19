import java.util.Scanner;
public class Slices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter one word: ");
        String w= sc.nextLine();
        for(int i =1; i<w.length();i++){
            String s= w.substring(0,i) + " " + w.substring(i);
            System.out.println(s);
            

        }


    
    }

}



