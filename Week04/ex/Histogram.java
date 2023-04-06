import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        
        

        if(args.length == 0){

            System.out.println("Please enter at least a number");
            System.exit(1);
        }
        System.out.println(Arrays.toString(args));


        int[] grades = new int[args.length];
        for (int i = 0; i < args.length; i++){
           grades[i] = Integer.parseInt(args[i]);
           
        }
        createHistogram(grades);
    }
    
    public static void createHistogram(int[] grades) {
        int[] histogram = new int[11];
        for (int grade : grades) {
            histogram[grade]++;
        }
    
       
        for (int i = 0; i < histogram.length; i++) {
            System.out.print(i + ": ");
    
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
    
            System.out.println();
        }
    }
}
    