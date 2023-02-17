import java.util.Arrays;

public class Histogram {
    public static void main(String args[]){

        int[] Grades={9,4,6,8,3,6,8,2,3,7};
        int[] cnt=new int[11];

        for(int i=0;i<Grades.length;i++) {
            for(int j=0;j<Grades.length;j++) {
                if(Grades[j]==i) cnt[i]++;
            }
            
        }

        for(int i=1;i<cnt.length;i++) {
            System.out.print("\n"+i+": ");
            for(int j=0;j<cnt[i];j++){
                System.out.print("* ");
            }
        }

        System.out.printf("mean: %f, mode: %d, median: %d\n", mean(Grades),mode(cnt),median(Grades));
    }
    

    public static double mean(int[] array) {
        int sum=0;
        for(int x: array) {
            sum+=x;
        }

        return ((double)sum) / array.length;
    }

    public static int mode(int[] array) {
        int max=0;
        int index=0;
        for(int i=1;i<array.length;i++) {
            if(array[i]>max) {
                max=array[i];
                index=i;
            }    
        }
        return index;
    }

    public static int median(int[] array) {
        int[] array2= array; 
        Arrays.sort(array2);
        if(array.length%2==0) {
            return (array2[array.length/2]+array2[(array.length/2)-1])/2;
        }

        else return array2[array.length/2];
        }
    }


