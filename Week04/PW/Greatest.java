package Week04.PW;

public class Greatest {
    private static int[] arr;


    public static int[] main(String[] args) {
    
        int min = arr[0];
        int max = arr[0];
    
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("Minimum element: " + min);
            }

            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Maximum element: " + max);

            }
        }
    
        int[] result = { min, max };
        return result;
      
        }
        
       }
       
      
    
    

