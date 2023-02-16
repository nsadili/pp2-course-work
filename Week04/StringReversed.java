import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word= scan.next();
        System.out.println(reverse1(word));
        System.out.println(reverse2(word));
        System.out.println(reverse3(word));
    }

    private static String reverse1(String str){
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+= str.charAt(i);
        }
        return res;
    }

    private static String reverse2(String str){
        char[] chars=str.toCharArray();
        int i=chars.length-1;
        int j=0;
        char temp;
        while(j<i){
            temp= chars[i];
            chars[i--]=chars[j];
            chars[j++]=temp;
        }

        return new String(chars);
    }

    private static String reverse3(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


}
