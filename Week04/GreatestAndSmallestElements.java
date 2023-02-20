import java.util.*;
import java.lang.Math;
import java.util.Random;
public class GreatestAndSmallestElements {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            int[] arr =new int[1000];
            int n,num=0;
            String a;
            int cnt=0,cnt_temp=0,cnt_arr=0,cnt_num=0;

            a=sc.nextLine();
            for(int i=a.length()-1;i>=0;i--){

                while (a.charAt(i)!=' '){

                    if(a.charAt(i)=='-'){num*=-1;break;}
                    cnt++;
                    num+=Math.pow(10,cnt_temp++)*Character.getNumericValue(a.charAt(i));
                    if(i==0)break;
                    i--;
                }
                cnt_temp=0;
                if(a.charAt(i)=='-'){continue;}
                arr[cnt_arr++]=num;

                num=0;
                cnt_num++;
            }
            for(int i=cnt_num-1;i>=0;i--){
                if(min>arr[i])min=arr[i];
                if(max<arr[i])max=arr[i];
            }
                System.out.print("min="+min+"\nmax="+max);
        }
    }

