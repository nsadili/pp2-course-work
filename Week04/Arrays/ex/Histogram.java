package Week04.Arrays.ex;

public class Histogram {

        static int[] countGrades(int grades[]) {
            int[] countArr = new int[11];
    
            for (Integer grade : grades) {
                countArr[grade]++;
            }
    
            return countArr;
        }
    
        static void histogram(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%2d| ", i);
                for (int j = 0; j < arr[i]; j++)
                    System.out.print("*");
    
                System.out.println(" > " + arr[i]);
            }
        }
    
      
        static void countingSort(int grades[]) {
            int[] counts = countGrades(grades);
    
            int curIdx = 0;
            for (int i = 0; i < counts.length; i++) {
                for (int j = 0; j < counts[i]; j++) {
                    grades[curIdx++] = i;
                }
            }
        }
    
       
        static float getMedian(int[] grades) {
            
            countingSort(grades);
    
            if (grades.length % 2 != 0)
                return grades[grades.length / 2];
    
            return (grades[grades.length / 2] + grades[grades.length / 2 + 1]) / 2;
        }
    
        
        static float getMean(int[] grades) {
            float avg = 0;
            for (int e : grades)
                avg += e;
    
            return avg / grades.length;
    
        }
    
        
        static int getMode(int[] grades) {
            int[] counts = countGrades(grades);
    
            int mode = 0;
            for (int i = 0; i < counts.length; i++)
                if (counts[i] > counts[mode])
                    mode = i;
    
            return mode;
        }
    
        public static void main(String[] args) {
            int grades[] = new int[] { 6, 7, 8, 9, 8, 7, 8, 9, 8, 9, 7, 8, 9, 5, 9, 8, 7, 8, 7, 8, 6, 7, 8, 9, 3, 9, 8, 7,
                    8, 7, 7, 8, 9, 8, 9, 8, 9, 7, 8, 9, 6, 7, 8, 7, 8, 7, 9, 8, 9, 2, 7, 8, 9, 8, 9, 8, 9, 7, 5, 3, 5, 6, 7,
                    2, 5, 3, 9, 4, 6, 4, 7, 8, 9, 6, 8, 7, 8, 9, 7, 8, 7, 4, 4, 2, 5, 3, 8, 7, 5, 6, 4, 5, 6, 1, 6, 5, 7,
                    8, };
    
            System.out.println(grades.length);
            int countArr[] = countGrades(grades);
            histogram(countArr);
    
    
            System.out.println("Median: " + getMedian(grades));
            System.out.println("Mean: " + getMean(grades));
            System.out.println("Mode " + getMode(grades));
    
        }
    }

