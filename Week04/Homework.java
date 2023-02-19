package Week04;

public class Homework {


    public static int findMin(int array[]){
        int min=99999 ;
    
        for(int var=0; var<array.length; var++){
            if(array[var]<min){
                min=array[var];
            }
        }

        return min;
    }


    public static int findMax(int array2[]){
        int max=0 ;
    
        for(int var2=0; var2<array2.length; var2++){
            if(array2[var2]<max){
                max=array2[var2];
            }
        }

        return max; 
    }






}
