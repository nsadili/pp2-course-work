import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        String word= scan.nextLine();
        System.out.println(reverse2(word));
    }
    
    private static String reverse1(String str){
        String res= "";
for(int i=str.length()-1; i>=0; i--){
    res+= str.charAt(i);
}
return res;
    }

    private static String reverse2(String str){

        char[]chars= str.toCharArray();
        var len = chars.length;

        for(int i=0;i<len/2;i++){
        char temp = chars[i];
        chars[i]=chars[len-1-i];
        chars[len-1-i]=temp;
        }

    return new String(chars);
    }
}
