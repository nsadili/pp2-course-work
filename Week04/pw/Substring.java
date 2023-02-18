import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        sc.close(); 
        System.out.println(isSubstring(str1, str2));

    }

    public static boolean isSubstring (String str, String sub){
        char[] chstr=str.toCharArray();
        char[] chsub=sub.toCharArray();
        //System.out.println(Arrays.toString(chstr));
        //System.out.println(Arrays.toString(chsub));

        return checker(chstr, chsub);

    }

    public static boolean checker (char[] char1, char[] char2){
        int j=0,cnt=0;

        for (int i=0; i<char1.length; i++){
            cnt=0;
            int ii=i;
            for (j=0; j<char2.length; j++){
                if(char1[ii++]==char2[j]){
                    cnt++;
                    //System.out.println("char1: "+ char1[ii-1]);
                    //System.out.println("char2: "+ char2[j]);
                    //System.out.println("cnt is: "+ cnt);
                    if (cnt==char2.length) {
                        System.out.println("the index of sub is: "+ i);
                        return true;
                    }
                } 
                else {
                    //System.out.println("finished at character "+ char1[i] + " in index: "+ i);
                    break;
                }
            }
            //System.out.println("\n");
        }
        System.out.println("-1");
        return false;
    }
}
