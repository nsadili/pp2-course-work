import java.util.Arrays;

public class Histogram
{
    public static void main(String[] args)
    {
        int[] grades = {3, 3, 4, 5, 1, 1, 9, 10, 9, 7};  // 1 1 3 3 4 5 7 9 9 10 

       
         
           int[] histogram = new int[11];

           //counting each grade's occurence and printing it below
           for(int grade : grades)
           {
              histogram[grade]++;
           }

           for(int i=0; i < histogram.length; i++)
           {
            System.out.println(i + ": " + histogram[i]);
           }

           calculate(grades);

    }

    public static void calculate(int[] grades)         
    {
        int l = grades.length;
    
        //calculating mean
        double sum = 0;
        for(int grade : grades)
        {
            sum += grade;
        }
        double mean = sum / l;


        //calculatin median
        Arrays.sort(grades); 
        double median;
        if(l % 2 == 0)
        {
            median = (grades[l/2] + grades[l/2 - 1]) / 2.0;
        }
        else
        {
            median = grades[l/2];
        }



        //calculate mode
        int mode = 0;
        int max = 0;
        int[] modeNums = new int[11];

        for(int grade : grades)
        {
            modeNums[grade]++;  
            if ( modeNums[grade] < max)
            {
                max = modeNums[grade];
            }                      
        }

        for(int i = 0; i< modeNums.length; i++)
        {            
            if(modeNums[i] == max)
            {
                mode = i;
            }
                   
        }

        System.out.println("Mean : " + mean);
        System.out.println("Median : " + median);
        System.out.println("Mode : " + mode);     
    


    }



}