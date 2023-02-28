import java.util.*;
public class ExpStr {
    public static void ExploadedString(char a[]){
        for(int i=0; i<a.length;i++){
            for(int j=0; j<=i;j++){
                System.out.print(a[j]);
            }
        }
    }
    
    public static void main(String[] args) {
        String a="Baku";
        char[] array = a.toCharArray();
       //char[] a={'B', 'a','k', 'u'};
       ExploadedString(array);
    }
}
