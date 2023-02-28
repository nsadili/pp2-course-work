import java.util.Scanner;

public class MixedString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = swapFirstAndLast(input);
        System.out.println(output);
    }

    public static String swapFirstAndLast(String input) {
        char[] array = input.toCharArray();
        char a = array[0];
        int an = 0, bn=-1;
        char temp, b;
        int cnt = 0;
        int i=0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == ' ')
                cnt++;
        }
        
        for (int j = 0; j < cnt; j++) {
            while (true) {
                if (i > 0 && array[i - 1] == ' ')
                    an = i;
                if (array[i + 1] == ' ')
                    bn = i;
                if(an!=-1 && bn!=-1){
                    temp=array[an];
                    array[an]=array[bn];
                    array[bn]=temp;
                    break;
                }
            }
        }
        String sent= array.toString();
        return sent;
    }

}
