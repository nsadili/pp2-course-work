import java.util.Scanner;

public class ExplodedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(explode(input));
    }

    static String explode(String input){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            for (int j = 0; j <= i; j++){
               
            sb.append(input.charAt(i));
                
            }
    }
        return sb.toString();
        
    }


   
}



