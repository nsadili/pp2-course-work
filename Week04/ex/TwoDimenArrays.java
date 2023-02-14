public class TwoDimenArrays {
    public static void main(String[] args) {
        
        int mArray[][] = new int[][]{ {2, 3, 4}, {5, 6, 7} };

               // int mArray[][] = new int[10][10];

            int irarr[][] = new int[5][];

            irarr[0] = new int[1];
            irarr[1] = new int[2];
            irarr[2] = new int[3];
            irarr[3] = new int[4];
            irarr[4] = new int[5];

            int a [] = { 1, 2, 3, 4, 5, 6};
            System.out.println("The size of array is : " + a.length);

            int b[][] = { {1, 2}, {3, 4}, {5, 6, 8} };
System.out.println("The size of array is : (" + b.length + ", " + b[0].length + ", " + b[2].length + ")");

            
            int c [] = { 1, 2, 3, 4, 5, 6};
            for (int k = 0; k < a.length; k++)
            System.out.println("The value of c[" + k + "]=" + c[k]);


    }
}
