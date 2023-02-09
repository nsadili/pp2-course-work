import java.util.Scanner ;
public class leapyear {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
System.out.print("enter a year: ");
int year = scanner.nextInt() ;
if (year % 4 == 0) {

System.out.println("This year is a leap year.");
}
else {
    System.out.println("This year is not a leap year.");

} 
}
}
}