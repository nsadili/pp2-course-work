import java.util.*;
import java.lang.Math;

public class AnagramsRef {


        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String st1 = sc.nextLine();
            String st2 = sc.nextLine();
            int[] unic = new int[600];
            boolean res = true;
            if(st1.length()!=st2.length())res=false;
            else {
                for (int i = 0; i < st1.length(); i++) {
                    unic[st1.charAt(i)]++;
                    unic[st2.charAt(i)]--;
                }

                for (int i = 0; i < unic.length; i++) {
                    if (unic[i] != 0) {
                        res = false;
                    }
                }
            }
            System.out.print(res);
        }
    }

