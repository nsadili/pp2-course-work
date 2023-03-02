public static int[] findMinMax(int[] arr) {
    if (arr.length == 0) {
        throw new IllegalArgumentException("Array cannot be empty");
    }
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
if (arr[i] < min) {
min = arr[i];
}
if (arr[i] > max) {
max = arr[i];
}
}
return new int[] {min, max};
}
