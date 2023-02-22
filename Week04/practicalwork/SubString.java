package Week04.practicalwork;

import java.util.Scanner;

public class SubString {
    public static void main (String [] args ){
      
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println(checkContains(string,sub));
   
    }
    
    public static int checkContains(String string, String sub){
        char[] string1 = string.toCharArray();
        char[] sub1 = sub.toCharArray();
        boolean flag = false;
        int index = 0;
        int count;
        for(int i=0; i<string1.length-sub1.length+1; i++){
            count = 0;
            for(int k=0; k<sub1.length; k++){
                if(string1[i+k] == sub1[k]){
                    count++;
                }
                else {
                    count = 0;
                    break;
                }

            }
            if(count==sub1.length){
                flag = true;
                index = i;
                break;
            }
        }
        return flag ? index : -1;
    }
}
