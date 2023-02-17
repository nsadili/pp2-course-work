import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please, provide some input!");
            System.exit(1);
        }

       int dataSet[] = new int[args.length];
       for(int i = 0; i < args.length; i++) {
        dataSet[i] = Integer.parseInt(args[i]);

    }

       //public static int Mean(dataSet[] arr) {


        // Mean
            int sum = 0;

            for (var el : dataSet) {
                sum += el;
            }
            System.out.println("The mean of the dataSet is: " + (double)sum/dataSet.length);

           
       // }

       

       // Median

       Arrays.sort(dataSet);

       if (dataSet.length % 2 != 0) {
        System.out.println("The median of the dataSet is: " + dataSet[dataSet.length / 2]);
       }
       else
       {
        System.out.println("The median of the dataSet is: " + (dataSet[(dataSet.length / 2)] + dataSet[dataSet.length / 2 - 1]) / 2.0);
        }
        



        // Mode
        int maxNumber = -1;
        int maxAppearances = -1;

        for(int i = 0; i < args.length; i++) {
            int count = 0;
            
            
            for(int j = 0; j < args.length; j++) {
                if (dataSet[i] == dataSet[j]) {
                    count++;
                }

                if (count > maxAppearances) {

                    maxNumber = dataSet[i];
                    maxAppearances = count;
                }
            }

        }
            System.out.println("The mode of the dataSet is: " + maxNumber);

        
    }

   
}
