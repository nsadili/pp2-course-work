public class Iterating {
    public static void main(String args[]) {
        int arr[][][]={{{1,2,3,4},{5,6,7,8}},{{9,10,11,12},{13,14,15,16}},{{17,18,19,20},{21,22,23,24}}};

        for(int i=0;i<arr.length;i++) {
            System.out.print("\n");
            for(int k=0;k<arr[i].length;k++) {
                System.out.print("  ");
                for(int z=0;z<arr[i][k].length;z++) {
                    System.out.print(arr[i][k][z]+" ");
                }
            }
        }
    }
}
