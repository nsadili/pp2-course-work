import java.util.Arrays;   import java.util.Scanner;

public class Anagrams  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first ");
        String str1=sc.nextLine();

        System.out.println("Enter second ");
        String str2=sc.nextLine();
        System.out.println(checkAnagram(str1, str2));

    }

    private static boolean checkAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){

            return false;
        }   

        char[] s1Arr=str1.toLowerCase().toCharArray();

        var s2Arr=str2.toLowerCase().toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        for(var i=0;i<s1Arr.length;i++){

            if(s1Arr[i]  != s2Arr[i])

            return true;
        }
        return false;
    }
}