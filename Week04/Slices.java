import java.util.Scanner;

public class Slices {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();

        for(int i = 0; i < str.length() - 1; i++){
            System.out.println(str.substring(0, i + 1) + " " + str.substring(i + 1, str.length()));
        }
    }
}
