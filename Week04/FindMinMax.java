public static void main(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
        arr[i] = Integer.parseInt(args[i]);
    }
    int min = findMinimum(arr);
    int max = findMaximum(arr);
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
}
