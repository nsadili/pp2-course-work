public class FormatSpecifierDemo {
    public static void main(String[] args) {
        int intValue = 42;
        float floatValue = 3.14159f;

        // Print integer value in different formats
        System.out.printf("Default (decimal): %d\n", intValue);
        System.out.printf("Hexadecimal: %x\n", intValue);
        System.out.printf("Octal: %o\n", intValue);
        System.out.printf("Binary: %s\n", Integer.toBinaryString(intValue));

        // Print floating-point value in different formats
        System.out.printf("Default (decimal): %f\n", floatValue);
        System.out.printf("Scientific notation: %e\n", floatValue);
        System.out.printf("Short scientific notation: %g\n", floatValue);
        System.out.printf("Percentage: %.2f%%\n", floatValue * 100);
    }
}
