public class ArrayMinMax {
    public static void main(String[] args) {
        int a[] = {12, 21, -3, 3, 4, 16, 74, 2, 13};
        int min = 1000000;
        int max = -1000000;
        for(int i: a) {
            if(i>max) {
                max = i;
                continue;
            }
            if(i<min) {
                min = i;
                continue;
            }
            
        }
        System.out.println("Max: "+max+", Min: "+min);
    }
}
