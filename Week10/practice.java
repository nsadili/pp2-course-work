public class practice {
   
     
public static void main(String[]args){

    
    int[] arr1=new int[]{1,2,3,4,5};
    double[] arr2=new double[]{0.1,0.2,0.3,0.4,0.5};
    String[] arr3=new String[]{"Cavid","Javid","David",};
    Task[] arr4=new Task[]{new Task("A",90,100),new Task("B",85,90)};
    Point[] arr5=new Point[]{new Point(1,10),new Point(2,5)};
    
printAll(arr4,2,3);

}
/* 
static void printAll(int[] arr1){
    for(Object el:arr1)
    System.out.print(el+" ");
    System.out.println();
}
*/
static <T> void printAll(T[]arr,int low,int high){
    for(int i=low;i<high;i++)
    System.out.print(arr[i]+" ");
    System.out.println();
}
static <T> void printAll(T[]arr){
    for(T el:arr)
    System.out.print(el+" ");
    System.out.println();
} 

}
