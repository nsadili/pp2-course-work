import java.util.Arrays;
import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) { 
        Scanner scan= new Scanner(System.in);
        int size = scan.nextInt();
        int grades []= new int[size];
        for(int i=0;i<size;i++){
        grades[i]= scan.nextInt();
        }
        int h []= new int [11];
        // h= histogram
        for(int grade : grades){

        h[grade]++;
        
        }
        for(int i=0; i<h.length; i++){
            System.out.println(i+":" + h[i]);


        }
        double sum =0;
        for(int grade :grades){
            sum+= grade;
        }
        double mean = sum/ grades.length;


        double median;
        if(grades.length%2==0){
            median = grades[grades.length/2 -1] +grades[grades.length/2];

        } else {
            median = grades[grades.length/2];
        }
       

        int mode = -100;
        int count2=0;

        for(int grade :grades){
            int count = 0;
            for(int i=0;i<grades.length;i++){
                if(grades[i]==grade){
                    count ++;
                }
            }
            if(count>count2){
                count2=count;
                mode=grade;

            }
        }
        
        System.out.println("Mean is: "+mean);
        System.out.println("Median is: "+median);
        System.out.println("Mode is: "+mode);
        System.out.println("The second solution is: "+ Arrays.toString(All(grades)));



 }

    //Can you define a method to calculate and return all three of them?
    private static double[] All(int[] arr){
        double sum2 =0;
        for(int grade :arr){
            sum2+= grade;
        }
        double mean2 = sum2/ arr.length;

        double median2;
        if(arr.length%2==0){
            median2 = arr[arr.length/2 -1] +arr[arr.length/2];

        } else {
            median2 = arr[arr.length/2];
        }



        int mode2 = -100;
        int count2=0;

        for(int grade :arr){
            int count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==grade){
                    count ++;
                }
            }
            if(count>count2){
                count2=count;
                mode2=grade;

            }
        }
       return new double[] {mean2,median2,mode2};
    }



    }


