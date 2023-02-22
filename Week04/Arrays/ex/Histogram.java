package Arrays.ex;

import java.util.Scanner;

public class Histogram {
    static int n;
    static int [] grades= new int[100];
    static float sum=0;
    static int cnt=0;
    static float max=-1;
    

    static float median;
    static int mode;
    

    public static void main(String[] args){

        Scanner Scan= new Scanner(System.in);
        
        System.out.print("please enter number of students: ");
        n=Scan.nextInt();
        
        System.out.print("please enter number of grades: ");
        for(int i=0;i<n;i++){
            grades[i]=Scan.nextInt();
        }
        mean();
        median();
        mode();
        
        }  


static void overal(){


}

static void mean(){
    for(int i=0;i<n;i++){
       sum= grades[i]+sum;
    }
    System.out.println("mean: "+sum/n);
}
static void median(){
    if(n%2==0){
        median=(grades[(n/2)-1]+grades[(n/2)])/2;
    }
    else{
        median=grades[(n/2)-1];
    }
    System.out.println("median: "+median);

}



static void mode(){
    for(int j=0;j<n;j++){
        cnt=0;
for(int i=0;i<n;i++)
{

if(grades[j]==grades[i]){
    cnt++;
}
}
if(cnt>mode){
   mode=grades[j];
}
}
System.out.println("mode: " +mode);
}



}
