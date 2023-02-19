import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
        String str1 = "Nariman";
        System.out.printf("Sorted String: %s", sortString(str1));

    }

    private static String sortString(String s1){
        char[] A = s1.toCharArray();
        for(int i=0;i<A.length;i++){
            if(A[i]<97) A[i]+=32;
        }
        Arrays.sort(A);
        
        String B = new String(A);
        return B;
    }
}
