import java.util.Scanner;

public class SubString {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first input:");
        String str1=sc.nextLine();
        System.out.println("Enter second input:");
        String str2=sc.nextLine();

        System.out.println(subString(str1, str2));

        
    }

    private static int subString(String str1,String str2){
        int a=0;

        for(var i=0;i<str1.length();i++){

            if(str1.charAt(i)==str2.charAt(0)){

                for(var x=1; x<str2.length();x++){

                    if(str1.charAt(i+x)!=str2.charAt(x)) a++;;
                }

                if(a==0){
                    return i;
                }else{
                    a=0;
                }

            }
        }

        return -1;
    }
}