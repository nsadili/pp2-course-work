import java.util.*;
public class ArrDemo {
public static void main(String[] args) {
int [] intArr = { 5,-1,2,3,55,3,-5};
String [] strArr = { "Konul", "Sariyya", "Aydin", "Habil", "Natavan"};
Arrays.sort(intArr);
Arrays.sort(strArr);
for (int i : intArr)
System.out.print(i + " ");
System.out.println();
for (String s : strArr)
System.out.print(s + " ");
}
}
