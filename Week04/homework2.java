public class homework2 {
    public static void main(String[] args) {
	    int a[]= {1, 2, 3, 4, 5, 6};
for (int k = 0; k < a.length; k++) {
    System.out.println("The value of a[" + k + "] = " + a[k]);
}

int a2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
for (int i = 0; i < a2.length; i++) {
    for (int j = 0; j < a2[i].length; j++) {
        System.out.println("The value of a2[" + i + "][" + j + "] = " + a2[i][j]);
    }
}

int a3[][][] = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}, {{9, 10}, {11, 12}}};
for (int i = 0; i < a3.length; i++) {
    for (int j = 0; j < a3[i].length; j++) {
        for (int k = 0; k < a3[i][j].length; k++) {
            System.out.println("The value of a3[" + i + "][" + j + "][" + k + "] = " + a3[i][j][k]);
        }
    }
}
    }
}