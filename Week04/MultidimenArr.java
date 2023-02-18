public class MultidimenArr {
    public static void main(String[] args){
        int arr[][];
        arr = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++)
            if(arr[i][j] % 2 == 0) 
            System.out.println(arr[i][j]);
        }
        
    } 
}
