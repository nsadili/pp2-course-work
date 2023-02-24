import java.util.Scanner;

public class Hangmancopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chance = 10;
        String word = "shirt";
        char[] letters = word.toCharArray(); // {"s","h","i","r","t"}

        
        int length = word.length();
        int R = length;

        char[] input = new char[length];
        StringBuilder strB = new StringBuilder();
        
        System.out.println("WELCOME TO THE HANGMAN");
        for(int j=0;j<length;j++){
            strB.append("_");
        }
        //System.out.println(strB);
        String SB = strB.toString();
        //System.out.println(SB);
        char[] SBChar = SB.toCharArray();

        for(int a=0;a<length;a++){
            System.out.print(SBChar[a]+" ");
        }
        System.out.println();

        System.out.print("enter letter- ");
        while(true){
            
            char ch = sc.next().charAt(0);
            for(int i=0;i<length;i++){

            if (letters[i]==ch){
                SBChar[i]=ch;
                R--;
            }

            if (letters[i]!=ch){
                chance--;
            }

        }
        for(int a=0;a<length;a++){
            System.out.print(SBChar[a]+" ");
        }
        System.out.println();
        
        for(int b=0;b<length;b++){
            System.out.println("you have "+chance+" chances");
        }
    }
        
    }
}
