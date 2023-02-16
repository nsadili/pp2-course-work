import java.util.Scanner;

public class Week4N7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // nextLine()
        System.out.printf("The 1st Reverse Method: %s\n", reverseV1(input));
        System.out.printf("The 2nd Reverse Method: %s\n", reverseV2(input));
        System.out.printf("The 3rd Reverse Method: %s\n", reverseV3(input));
        System.out.printf("The 4th Reverse Method: %s\n", reverseV4(input));
        
    }

    static String reverseV1(String str){
    
        String tmp = "";
        for (int i=str.length()-1;i>=0;i--){
            tmp+=str.charAt(i);
        }
        return tmp;
    }

    static String reverseV2(String str){
        char[] chars = str.toCharArray();
        int len = chars.length;
        
        for (int i=0; i< len/2 ;i++){ //
            char tmp = chars[i];
            chars[i]=chars[len-1 -i];
            chars[len-1 -i] = tmp;
        }
        return new String(chars);
    }

    static String reverseV3(String str){ 
        StringBuilder sb = new StringBuilder(); // string builder object

        for (int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    static String reverseV4(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
