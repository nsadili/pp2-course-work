import java.util.*;
public class Test6 {
public static void main(String[] args) {
int [][] matrixOfOnes = new int[5][5];
for (int[] row: matrixOfOnes)
Arrays.fill(row,1);
for (int i=0;i<matrixOfOnes.length;i++) {
System.out.print("| ");
for (int j=0;j<matrixOfOnes[i].length;j++)
System.out.print(matrixOfOnes[i][j]+" ");
System.out.println("|");
}
}
}
