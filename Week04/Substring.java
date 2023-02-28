import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String string=scan.next();
        String sub=scan.next();
        int out=Sub( string,  sub);
        System.out.println(out);
    }

    public static int Sub(String string, String sub){
        char[] array= string.toCharArray();
        char[] subarr= sub.toCharArray();
        boolean flag=false;
        int ind=0;
        for(int i=0; i<(array.length-subarr.length)+1;i++){
            if(subarr[0]==array[i]){
                flag=true;
                int j=i, x=0;
                ind=i;
                for(j=i;j<subarr.length;j++){
                    if(subarr[x++]!=array[j]) flag=false;
                }
                if(flag) break;
            }
        }
        if(flag) return ++ind;
        else return -1;

    }
}
