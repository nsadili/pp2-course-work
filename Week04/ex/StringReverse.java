import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println("reverse1 function: "+ reverse1(word));
        System.out.println("reverse2 function: "+ reverse2(word));
        System.out.println("reverse3 function: "+ reverse3(word));
        System.out.println("reverse4 function: "+ reverse4(word));



        sc.close();
    }

    private static String reverse1 (String str){

        String res="";
        for (int i=str.length()-1; i>=0; i--){
            res+= str.charAt(i);
        }
        return res;
    }

    private static String reverse2 (String str){
        char [] chars = str.toCharArray();

        var len=chars.length;
        for (int i=0; i<chars.length/2; i++){
            char temp = chars[len-1-i];
            chars[len-i-1]=chars[i];
            chars[i]=temp;
        }
        return new String(chars);
    }

    private static String reverse3 (String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static String reverse4 (String str){
        return new StringBuilder(str).reverse().toString();
    }
}
