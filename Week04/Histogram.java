package Week04;

import javax.annotation.processing.SupportedOptions;

public class Histogram {
    static int cnt0=0;
    static int cnt1=0;
    static int cnt2=0;
    static int cnt3=0;
    static int cnt4=0;
    static int cnt5=0;
    static int cnt6=0;
    static int cnt7=0;
    static int cnt8=0;
    static int cnt9=0;
    static int cnt10=0;
    public static void main(String[] args){
        double sum = 0.0;
        double  count = 0.0;

        int[] histogram = {1, 4, 3, 2, 3, 7, 4, 5, 6, 7, 3, 4, 9, 10, 10};
        for (int i=0; i< histogram.length; i++ ){
            sum += histogram[i];
            count++;
            if (histogram[i] == 0 ) cnt0++;
            if (histogram[i] == 1 ) cnt1++;
            if (histogram[i] == 2 ) cnt2++;
            if (histogram[i] == 3 ) cnt3++;
            if (histogram[i] == 4 ) cnt4++;
            if (histogram[i] == 5 ) cnt5++;
            if (histogram[i] == 6 ) cnt6++;
            if (histogram[i] == 7 ) cnt7++;
            if (histogram[i] == 8 ) cnt8++;
            if (histogram[i] == 9 ) cnt9++;
            if (histogram[i] == 10 ) cnt10++;
        }
        System.out.println("Median: " + histogram[7]);
        int max= -1;
        
        int hist2[] = {cnt0, cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, cnt8, cnt9, cnt10 };
        for (int j=0;j< hist2.length; j++ ){
            
            if (hist2[j]>= max){
                max = hist2[j];
            }
        }
        
        double mean = sum/count;
        
        System.out.println("Moda: "+ max);
        System.out.println("Mean: "+ mean);
    }
    
}