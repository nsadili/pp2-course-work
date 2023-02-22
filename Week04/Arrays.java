import java.util.*;

public class Arrays {
    public static void main(String[] args) {        
        
                        //Get Array
        // int[] num = new int[args.length];
        // for (int i = 0; i < args.length; i++) {
        //     num[i] = Integer.parseInt(args[i]);
        // }
                        //OR

        // int[] num2 = new int[args.length];
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < args.length; i++){
        //     num2[i] = sc.nextInt();
        // }
        
        int[] num = {5, 3 , 3, 2, 2, 1, 4, 5, 1, 2, 10, 9, 9, 2, 2, 3, 4, 8, 7, 6};

        //findHistogram.histogram(num);
        findMinAndMax.findMinAndMax(num);
        sumArrays.sumArrays(num);
        printArrays.printArrays(num);
    }

}
    

    
    // //private static String reverse1(String str) {
    //     String res = "";
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         res += str.charAt(i);
    //     }
    //     return res;
    // }

    // //private static String reverse2(String str) {
    //     char[] chars = str.toCharArray();
    //     int l = chars.length;
    //     for (int i = 0; i < l / 2; i++) {
    //         char tmp = chars[i];
    //         chars[i] = chars[l - i - 1];
    //         chars[l - i - 1] = tmp;
    //     }
    //     return new String(chars);
    // }

    // //private static String reverse3(String str) {

    //     StringBuilder sb = new StringBuilder();
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         sb.append(str.charAt(i));
    //     }
    //     return new String(sb); // == return sb.toString();
    // }

    // //private static String reverse4(String str) {

        // return new StringBuilder(str).reverse().toString();
        
    // }

    



