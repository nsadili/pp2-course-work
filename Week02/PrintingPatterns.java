import java.util.*;
import java.lang.Math;
public class PrintingPatterns {
        public static void main(String args[]) {

            for (int j=1;j<=4;j++){
                for(int i=1;i<=5;i++){
                    if((i+j)%2==0)System.out.print("*");
                    else System.out.print("#");
                }
                System.out.println();
            }

        }

    }


