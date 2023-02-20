public class Hw2{
    public static void main(String[] args) {
        int [][] a={ {2, 3 , 5}, {5, 3, 6 }, {8, 9 ,0}};
int [][][] b={ { {3, 4}, {2, 3}}, {{1, 2}, {6, 7}}};
int i, j, k;
System.out.println("2D array values:");
for (i=0; i<a.length; i++){
    for(j=0; j<a.length; j++){
        System.out.print(a[i][j]+" ");
    }
    }
    System.out.println();
    System.out.println("3D array values: ");


    for (i=0; i<b.length; i++){
        for(j=0; j<b.length; j++){
            for(k=0;k<b.length; k++ ){

                System.out.print(b[i][j][k]+" ");
            }
        }
            }

    }
}