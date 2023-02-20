public class Histogram {

    public static void main(String[] args) {

    int[] grades = {7, 8, 9, 7, 6, 8, 9, 10, 8, 7, 6, 7, 8, 9, 10, 9, 8, 7, 9, 10};
int[] histogram = new int[11]; // there are 11 possible grades from 0 to 10

// count the number of occurrences of each grade
for (int grade : grades) {
    histogram[grade]++;
}

// print out the histogram
for (int i = 0; i < histogram.length; i++) {
    System.out.println(i + ": " + histogram[i]);

} }

    
}

