import java.util.Arrays;
public class MixedStrings {
    public static void main(String[] args) {
        String str1 = "This Apple";
        //System.out.println(reverseFirstLast(str1));
        reverseFirstLast(str1);
    }

    private static void reverseFirstLast(String s1){
        String[] a = s1.split(" ");
        
        char[] A = a.toCharArray(); // T h i s
        for(int i=0;i<a.length;i++){
            for (int j=0;j<A.length;j++){
                char temp = A[0]; // T
                A[0] = A[A.length-1]; // T=s
                A[A.length-1] = temp; // s
                //a[i] = A.toString(); //shiT
                
                System.out.print(A[i]);
            }
            //s = String.join(" ", a);
        }
        
        
    }
}
