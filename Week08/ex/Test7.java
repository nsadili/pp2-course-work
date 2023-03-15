import java.util.*;
public class Test7 {
public static void main(String[] args) {
int [] intArr1 = { 5,-1,2,3,55,3,-5};
int [] intArr2 = { 5,-1,2,7,53,3,5};
int idx = Arrays.mismatch(intArr1,intArr2);
System.out.println("Mismatch index: "+idx);
System.out.println("Elements "+intArr1[idx]+" and "+intArr2[idx]+" do not match");
}
}
