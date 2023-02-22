import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // finding min and max
        // int min = 100000, max = -100000;
        // int b[] = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0 };
        // for (int x : b) {
        // if (min > x)
        // min = x;
        // if (max < x)
        // max = x;
        // }
        // System.out.println(min + " " + max);
        // // finding iteration of multidimensional array
        // int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        // for (int k = 0; k < a.length; k++) {
        // for (int i = 0; i < a[k].length; i++)
        // System.out.printf("%d ", a[k][i]);
        // } // two dimensional

        // int c[][][] = { { { 21, 3 }, { 1, 90 } }, { { 4, 65 }, { 2, 9 }, { 2212, 23,
        // 11 } } };
        // for (int k = 0; k < c.length; k++) {
        // for (int i = 0; i < c[k].length; i++)
        // for (int j = 0; j < c[k][i].length; j++)
        // System.out.print(c[k][i][j] + " ");
        // } // three dimensional
        // Scanner scan = new Scanner(System.in);
        // String s = scan.next();// one word
        // String s1 = scan.nextLine();// one line
        // length() for String
        // length for array

        // int[] num = new int[args.length];
        // for (int i = 0; i < args.length; i++) {
        //     num[i] = Integer.parseInt(args[i]);
        // }

        // printArr(num);
        // System.out.println(sum(num));
            System.out.print(reverse3("abala"));
        // var chars = s1.toCharArray();
        // int l = chars.length;
        // for (int i = 0; i < l / 2; i++) {
        // char tmp = chars[i];
        // chars[i] = chars[l-i-1];
        // chars[l-i-1] = tmp;
        // }

        // return StringBuilder(str).reverse().toString();
        // return new String(chars);
        // int to string

    }

    private static void printArr(int[] num) {
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static String reverse1(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    private static String reverse2(String str) {
        char[] chars = str.toCharArray();
        int l = chars.length;
        for (int i = 0; i < l / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[l - i - 1];
            chars[l - i - 1] = tmp;
        }
        return new String(chars);
    }

    private static String reverse3(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return new String(sb); // == return sb.toString();
    }

    private static String reverse4(String str) {

        return new StringBuilder(str).reverse().toString();
        
    }

    private static int sum(int[] num) {
        int sum = 0;
        for (int y : num) {
            sum += y;
        }
        return sum;
    }
}
