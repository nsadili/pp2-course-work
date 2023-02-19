import java.util.Scanner;
public class SortingString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Here is sorted String : " + sorted(s));

    }

    public static String sorted(String s){
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            for(int j = i + 1; j < chars.length; j++){
                if(chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        for(int m = 0; m < chars.length; m++) {
            sb.append(chars[m]);
        }
        return sb.toString();
    }
}
