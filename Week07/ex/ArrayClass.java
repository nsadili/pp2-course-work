public class ArrayClass {
    public static void main(String[] args) {
        
        int[] arr = {0, 2, 3, 4, 5};

        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);

        try{
            System.out.println("Result: " + a / b);
        } catch(ArithmeticException ex1) {
            System.out.println("ArithmeticException: " + ex1.toString());
        } catch(ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Array index: " + ex2.toString());
        } finally {
            arr = new int[] {1, 2, 3};
            System.out.println("Array is reset");
        }
    }
}
