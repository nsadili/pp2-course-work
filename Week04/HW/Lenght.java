public class Lenght {
    public static void main(String[] args){
        int a[][] = { {1, 2}, {3, 4}, {5, 6} };
            int b[][][] = {{ {1,3,2}, {3,4,4}, {5,6,6} },{ {1,3,2}, {3,4,4}, {5,6,6} }};
            System.out.printf("2D array:\n");
            for (int i=0;i<a.length;i++){
                for (int k=0;k<a[0].length;k++){
                    System.out.printf("%d ",a[i][k]);
                }
                System.out.println("");
            }
            System.out.printf("\n3D array:\n");
            for (int i=0;i<b.length;i++){
                for (int k=0;k<b[0].length;k++){
                    for (int q=0;q<b[0][0].length;q++){
                    System.out.printf("%d ",b[i][k][q]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        
            }
    }

