import java.util.*;

public class Substring {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String st = sc.nextLine();
        String sub = sc.nextLine();
        char[] ch_st = st.toCharArray();
        char[] ch_sub = sub.toCharArray();
        int cnt=0;
        int cnt_temp=0;
        int index=0;
        for(int j=0;j<ch_st.length;j++) {
            for (int i = 0; i < ch_sub.length; i++) {
                if (ch_st[j] != ch_sub[i]) {
                    cnt_temp = 0;
                    break;
                }
                if (ch_st[j] == ch_sub[i]) {
                    cnt_temp++;
                    j++;
                }
                if (cnt_temp > cnt) {
                    cnt = cnt_temp;
                    index = j - cnt_temp;
                }

            }
        }
        if(cnt==ch_sub.length)System.out.println(index);
        else System.out.println(-1);
    }
}
