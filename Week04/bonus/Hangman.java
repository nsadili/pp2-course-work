import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chance = 10;
        String word = "shirt";
        char[] letters = word.toCharArray(); // {"s","h","i","r","t"}

        
        int length = word.length();
        int R = length;

        char[] input = new char[length];
        StringBuilder strB = new StringBuilder();
        
        for(int j=0;j<length;j++){
            strB.append("_");
        }
        //System.out.println(strB);
        String SB = strB.toString();
        //System.out.println(SB);
        char[] SBChar = SB.toCharArray();



        for(int i=0;i<length;i++){
            input[i] = sc.next().charAt(i);

            if (input[i]==letters[i]){
                R--;
                char temp;
                temp=SBChar[i];
                SBChar[i] = input[i];
                input[i]=temp;
                SB = SBChar.toString();
                System.out.println(SB);
            }
            if (input[i]!=letters[i]){
                chance--;
                //System.out.printf("WRONG!!!\nchance: %d", chance);
            }
        }
    }
}
