import java.util.Scanner;
import java.util.Arrays;
public class Histogram{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int s = scan.nextInt();
        int[] grades = new int[s];
        System.out.println("Enter their grades :");
        for(int i = 0; i < s; i++){
            grades[i] = scan.nextInt();
        }

        int num1 = 0, num2 =0 , num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0, num10=0;
        for(int j : grades){
            switch(j){
                case 1:
                    num1++;
                    break;
                case 2:
                    num2 ++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
                case 7:
                    num7++;
                    break;
                case 8:
                    num8++;
                    break;
                case 9:
                   num9++;
                   break;
                case 10:
                    num10++;
            }
        }
        int [] histogram = new int[]{num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        for(int i = 0; i < 10; i++) {
            System.out.println("The number of students who got " + (i + 1) + " is " + histogram[i]);
        }

        System.out.println(MeanMedianMode(grades));
    }

    public static String MeanMedianMode(int [] g){
        int sum = 0;
        for(int i: g){
            sum += i;
        }
        double mean = (double)sum / g.length;

        Arrays.sort(g);
         double median;
        if(g.length % 2 == 0){
         median = (double)(g[(g.length) / 2 - 1] + g[g.length / 2]) / 2;
        }else{
            median = g[(int)(g.length / 2 - 0.5)];
        }
        int num1 = 0, num2 =0 , num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0, num10=0;
        for(int j : g){
            switch(j){
                case 1:
                    num1++;
                    break;
                case 2:
                    num2 ++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
                case 7:
                    num7++;
                    break;
                case 8:
                    num8++;
                    break;
                case 9:
                    num9++;
                    break;
                case 10:
                    num10++;
            }
        }
        int [] arr = new int[]{num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        int moda = 0;
        for(int j : arr){
            if(j > moda) moda = j;
        }

        return "The mean of grades is " + mean + " .The median is " + median + " and the moda is " + moda;
    }
}
