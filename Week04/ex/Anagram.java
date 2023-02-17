import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1=sc.nextLine();

        System.out.println("Enter 2.nd String: ");
        String s2=sc.nextLine();
        System.out.println(checkAnagram(s1, s2));

    }

    private static boolean checkAnagram(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }   

        char[] s1Arr=s1.toLowerCase().toCharArray();
        var s2Arr=s2.toLowerCase().toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        for(var i=0;i<s1Arr.length;i++){
            if(s1Arr[i]!=s2Arr[i])
            return false;
        }



        return true;
    }
}
