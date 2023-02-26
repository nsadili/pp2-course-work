import java.util.Arrays;

public class LearnArr{
    public static void main(String[] args){

        int[] arr1 = new int[1];
        int arr2[] = new int[2];

        int[] arr3;
        arr3 = new int[3];

        int arr4[];
        arr4 = new int[4];

        int cnt = 0;

        for(int i = 0; i < arr1.length; i++)
        arr1[i] = cnt++;
        for(int i = 0; i < arr2.length; i++)
        arr2[i] = cnt++;
        for(int i = 0; i < arr3.length; i++)
        arr3[i] = cnt++;
        for(int i = 0; i < arr4.length; i++)
        arr4[i] = cnt++;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {1, 2, 3, 4, 5};
        System.out.println("\n");
        System.out.println(Arrays.toString(arr5));

        int[] arr6;
        arr6 = new int[] {6, 7, 8, 9, 10};
        System.out.println();
        System.out.println(Arrays.toString(arr6));

        int[][] arr7 = new int[][]{{11, 12, 13}, {14, 15, 16}};
        System.out.println();
        System.out.println(Arrays.deepToString(arr7));

        int[][]arr8;
        arr8 = new int[2][3];

        cnt = 0; 

        for(int i = 0; i < arr8.length; i++) {
            for(int j = 0; j < arr8[i].length; j++)
            arr8[i][j] = cnt++;
        }

        System.out.println("\n");
        System.out.println(Arrays.deepToString(arr8));

        int[][][] arr9 = new int[][][] {
            {{17, 18, 19}, {20, 21, 22}},
             {{23, 24, 25}, {26, 27, 28}}
        };
        
        System.out.println();
        System.out.println(Arrays.deepToString(arr9));


        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int[][][] arr10 = new int[x][y][z];

        cnt = 0;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                for(int k = 0; k < z; k++){
                    System.out.println("Enter the value for arr10[" + i + "][" + j + "][" + k + "]");
                    arr10[i][j][k] = cnt++;
                }
            }
        }
    }
}