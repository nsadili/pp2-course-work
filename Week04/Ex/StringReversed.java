import java.util.Scanner;
public class StringReversed {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    String word =scan.nextLine();
    System.out.println("The first solution is: "+reverse2(word));
    System.out.println("The second solution is: "+reverse2(word));
    System.out.println("The third solution is: "+reverse3(word));
    System.out.println("The fourth solution is: "+reverse4(word));
    
    }
    private static String reverse (String str){
        String res="";
        for(int i= str.length()-1;i>=0;i--){
            res += str.charAt(i);
        }
        return res;
    }
    private static String reverse2(String str){
        char [] chars = str.toCharArray();
        var len= chars.length;
        for(int i=0; i<chars.length/2;i++){
            char temp= chars[i];
            chars[i]= chars[len-1-i];
            chars[len-1-i]= temp;
        }
        return new String(chars);

    }
    private  static String reverse3(String str){
        StringBuilder sb= new StringBuilder();
        for(int i= str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));


        }
        return sb.toString();
    }
    private static String reverse4(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
