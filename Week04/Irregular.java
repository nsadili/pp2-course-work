public class Irregular {
    public static void main(String[] args){
        int irarr[][] = new int[5][];
        irarr[0] = new int[1];
        irarr[1] = new int[2];
        irarr[2] = new int[3];
        irarr[3] = new int[4];
        irarr[4] = new int[5];

        for(int i = 0; i < irarr.length; i++){
            for(int j = 0; j < irarr[i].length; j++){
                System.out.print(irarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
