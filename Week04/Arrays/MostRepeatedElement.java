package Week4.Arrays;

public class MostRepeatedElement {

    public static int mostFrequent(int[] arr, int n){
        int maxCount = 0;
        int max_repeated_element = 0;
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }

            if(cnt>maxCount){
                maxCount=cnt;
                max_repeated_element=arr[i];
        }
        }
        return max_repeated_element;
    }
        public static void main(String args[]){
            int[] arr = new int[]{2, 4, 6, 2, 8, 2, 12};
            int n = arr.length;
            System.out.println(mostFrequent(arr, n));
                    
    }
}
