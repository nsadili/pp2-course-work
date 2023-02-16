import java.util.Scanner;

import javax.swing.text.PlainView;

public class Histogram {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the number of inputs: ");

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        int histogram[]=new int[11];

        for(int i=0;i<histogram.length;i++){
            histogram[i]=0;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) histogram[0]++;
            else if(arr[i]==1) histogram[1]++;
            else if(arr[i]==2) histogram[2]++;
            else if(arr[i]==3) histogram[3]++;
            else if(arr[i]==4) histogram[4]++;
            else if(arr[i]==5) histogram[5]++;
            else if(arr[i]==6) histogram[6]++;
            else if(arr[i]==7) histogram[7]++;
            else if(arr[i]==8) histogram[8]++;
            else if(arr[i]==9) histogram[9]++;
            else if(arr[i]==10) histogram[10]++;


        }

        for(int i=0;i<histogram.length;i++){
            System.out.printf("number of %d grades: %d\n",i,histogram[i]);
        }

        System.out.printf( 

        "Mean: %.2f , median : %.2f , mode: %.2f ",modeMedMean(arr, histogram)[0],modeMedMean(arr, histogram)[1],modeMedMean(arr, histogram)[2]

        );
        


    }

    public static double[] modeMedMean(int[] arr,int[] histogram){

        double mean=0.0;

        var sum=0;
        var numberOfGrades=0;
        var mode=0;

        for(int i=0;i<histogram.length;i++){

            sum+=i*histogram[i];
            numberOfGrades+=histogram[i];

           if(mode<=histogram[i]) mode=i;
        }

        mean=((double) sum)/numberOfGrades;

        var median=0.0;

       int[] sortedArr=new int[arr.length];


       for(int i=0;i<arr.length;i++){
        sortedArr[i]=arr[i];   // i create the copy of arr 

       }

       var i=0;
       var j=sortedArr.length-1;

       for(i=0;i<sortedArr.length;i++){
        for(j=i+1;j<sortedArr.length;j++){
            if(sortedArr[i]>sortedArr[j]){
                int temp=sortedArr[i];
                sortedArr[i]=sortedArr[j];
                sortedArr[j]=temp;   // i sort the arr from min to max
            }
        }   
       }

       if(sortedArr.length%2!=0){
        median=sortedArr[sortedArr.length/2];
       }else{

        median=sortedArr[sortedArr.length/2]+sortedArr[(sortedArr.length/2)-1];
        median/=2;

       }


       double res[]={mean,median,mode};

       return res;




    }


}
