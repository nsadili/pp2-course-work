public class ForLoop {
 public static void main(String[] args) {
    
     int [] arr = { 2, 4, 55, -4, 3};

    int sum = 0;

    for (int x : arr) {
    sum += x;
    }

    System.out.println("sum: "+ sum);


    int [][] arr1 = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };

    int sum1 = 0;

    for (int x[] : arr1) {
    for (int y : x) {
    sum1 += y;
    }
    

    }   
    System.out.println("sum1: "+ sum1);

}
}