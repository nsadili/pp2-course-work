public static String toCharArray(String input) {
    char[] chars = input.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
}

public static void main(String[] args) {
    String input = "Nuraddin_Sadili";
    String sorted = toCharArray(input);
    System.out.println("Original string: " + input);
    System.out.println("Sorted string: " + sorted);
}