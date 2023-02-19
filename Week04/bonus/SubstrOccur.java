import java.util.Scanner;

public class SubstrOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        System.out.println("Total number of same substrings: "+numberOfSub(str1, str2));
    }

    public static int numberOfSub(String str1, String str2){
        int len=0;
        len=str1.length()>str2.length() ? str2.length() : str1.length();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int cnt=0, cnt2=0;
        for (int i=0; i<=len; i++){
            if (i==len){
                if (cnt>0) {
                    cnt2++;
                    System.out.println("Substring number "+ cnt2+ ": "+sb.toString());
                    sb.delete(0, sb.length());
                }
                cnt=0;
                break;
            }

            if (ch1[i]==ch2[i]) {
                cnt++;
                sb.append(ch1[i]);
            }
            
            else{
                if (cnt>0) {
                    cnt2++;
                    System.out.println("Substring number "+ cnt2+ ": "+sb.toString());
                    sb.delete(0, sb.length());
                }
                cnt=0;
            }
        }
        return cnt2;
    }
}
