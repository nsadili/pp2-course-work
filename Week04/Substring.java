package Week04;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first input: ");
            System.out.println("Enter the second input:");

            String str1=sc.nextLine();
            String str2=sc.nextLine();

            System.out.println(subString(str1, str2));
        }

        
    }

    private static int subString(String str1,String str2){
        int res=0;
        for(var i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0)){
                for(var j=1;j<str2.length();j++){
                    if(str1.charAt(i+j)!=str2.charAt(j)) res++;;
                }

                if(res==0){
                    return i;
                }else {
                    res=0;
                }

            }
        }

        return -1;
    }
}