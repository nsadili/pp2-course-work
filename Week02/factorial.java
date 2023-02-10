
public class factorial {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
int result = 1 ;
for (int i = 1 ; i<= number ; i++) {
    result= result*i ;
}
if (number < 0) {
System.out.println("Error");
}
    System.out.println(result) ;
    }
}
