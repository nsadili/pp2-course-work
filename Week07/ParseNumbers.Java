public static double parseNumber(String input) {
    String numericInput = input.replaceAll("[^\\d.]", "");
    double number = Double.parseDouble(numericInput);
    return number;
}

public static void main(String[] args) {
    String input = "123.45abc6.7";
    double result = 0.0;
    String numericInput = input.replaceAll("[^\\d.]", "");
    if (!numericInput.isEmpty()) {
        result = Double.parseDouble(numericInput);
    }
    System.out.println("Input: " + input);
    System.out.println("Result: " + result);
}
