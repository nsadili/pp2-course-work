import java.util.Scanner;

public class Substring {
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    
        String str= sc.nextLine();
        String sub= sc.nextLine();
        System.out.println(compare(str, sub));
        System.out.println("Index is: "+getIndex(str, sub));
    

      
    }
    private static boolean compare(String str, String sub){
  
        for(int i=0;i<=str.length()- sub.length();i++){
            for(int k=0; k<sub.length();k++){
                if(str.charAt(i+k)!= sub.charAt(k)){
                    break;
                  

                }
                if(k==sub.length()-1){
                    return true;
                }
                
            }
        }
        return false;
    }
    private static int getIndex(String str, String sub){
        for(int i=0;i<=str.length()- sub.length();i++){
            for(int k=0;i<sub.length();k++){
                if(str.charAt(i+k)!= sub.charAt(k)){
                    break;
                }
                if(k==sub.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
  

}