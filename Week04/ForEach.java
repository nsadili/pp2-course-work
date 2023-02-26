public class ForEach {
    public static void main(String[] args){
        int[] arr1 = {1, 98, -85, 8, 6};

        int sum = 0;

        for(int x : arr1){
            sum += x;
        }

        System.out.println(sum);

        int arr2[][] = {{1, 5, 9}, {8, 4, 9}};

        int product = 1;

        for(int[]x : arr2){
            for(int y : x){
                product *= y;
            }
        }

        System.out.println(product);


        int[][][] arr3 = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}},
            {{13, 14, 15}, {16, 17, 18}}
        };

        int sumOf = 0;

        for(int[][]x : arr3){
            for(int[] y : x){
                for(int z : y){
                    sumOf += z;
                }
            }
        }
        System.out.println(sumOf);

    }
}
