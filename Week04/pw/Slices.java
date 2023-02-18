import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();

        sliceString(str);

        sc.close(); 

    }

    public static int sliceString(String str){
        int len=str.length();
        String str1=" ";
        String str2=" ";

        for (int i=0; i<str.length();i++){
            str1=str.substring(0, i);
            str2=str.substring(i,len);
            System.out.println(str1+" "+str2);
    }
    return 0;
}

    
}
