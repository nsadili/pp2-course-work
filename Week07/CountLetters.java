package Week07;
import java.util.*;
public class CountLetters{
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    sc.close();
    char c= ' ';
    int cnt=0;
    char[] b= a.toCharArray();
    for(int i=0;i<b.length();i++){
        if(b[i]!= c);
        cnt++;
    }
    System.out.print(cnt);
}
}