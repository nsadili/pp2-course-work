public class ThreeDimenArray {
    public static void main(String[] args){
        int[][][] cube = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.println("The value of cube[" + i + "][" + j + "][" + k + "] = " + cube[i][j][k]);
                }
            }
        }
        
    }
}
