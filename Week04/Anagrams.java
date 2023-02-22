import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        String str = args[0];
        String str2 = args[1];

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        if(str.length() == str2.length()){
            char[] arr = str.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr);
            Arrays.sort(arr2); 

            int x = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] != arr2[i]) x = 1;
            }

            if(x == 0) System.out.println(str + " and " + str2 + " are anagrams");
            else System.out.println(str + " and " + str2 + " are not anagrams");
        }
        else System.out.println(str + " and " + str2 + " are not anagrams");
    }
}
