public static int[] calculateMinMax(int[] arr) {
    int[] minMax = {arr[0], arr[0]};
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > minMax[1]) {
            minMax[1] = arr[i];
        } else if (arr[i] < minMax[0]) {
            minMax[0] = arr[i];
        }
    }
    return minMax;
}

//the usage of functions and chainging of the array to the form of integers