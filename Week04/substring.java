import java.util.Scanner;

public class substring {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        System.out.println(subString(a, b));
        
    }

    private static int subString(String a,String b){
        int flag=0;

        for(var i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(0)){
                for(var j=1;j<b.length();j++){
                    if(a.charAt(i+j)!=b.charAt(j)) flag++;;
                }
                if(flag==0){
                    return i;
                }
                else
                {
                    flag=0;
                }
            }
        }
        return -1;
    }
}
