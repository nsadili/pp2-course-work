import java.util.*;
public class Test5 {
public static void main(String[] args) {
int [] intArr = { 5,-1,2,3,55,3,-5};
int idx = Arrays.binarySearch(intArr,-5);
System.out.println("Search result without sorting: "+idx);
Arrays.sort(intArr);
idx = Arrays.binarySearch(intArr,-5);
System.out.println("Search result with sorting: "+idx);
}
}
