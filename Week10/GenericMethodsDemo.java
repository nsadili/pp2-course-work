public class GenericMethodsDemo {
    public static void main(String[] args) {

        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T3", 9, 50),
                new Task("T4", 15, 23) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        printAll(arr3);
        System.out.println(middle(arr4));
        System.out.println(max(arr2));

         printAll(arr1);
        sort(arr1);
        printAll(arr1);

        sort(arr4);
        printAll(arr4);
    }

    static <T> void printAll(T[] arr) {

        printAll(arr, 0, arr.length - 1);

    }

    static <T> void printAll(T[] arr, int lower, int upper) {

        if (lower < 0 || upper < 0 || lower >= arr.length || upper > +arr.length)
            throw new ArrayIndexOutOfBoundsException("Either lower or Upper bound is incorrect!");

        for (var i = lower; i <= upper; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printAll(Task[] arr) {

        for (var i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && i != 0)
                System.out.println();
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    static <T> T middle(T[] arr) {
        if(arr.length == 0) throw new IllegalArgumentException("Length equals to Zero");

        return arr[arr.length / 2];
    }

    static <T extends Comparable<? super T>> T max(T[] arr) {
        if(arr.length==0) throw new IllegalArgumentException("Length equals to Zero");
        var max = arr[0];

        for(var el:arr){
            if(el.compareTo(max) > 0) max=el;
        }

        return max;
    }

    static <T extends Comparable<? super T>> void sort(T[] arr){

        for(var i=0;i<arr.length;i++){
            for(var j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j]) > 0) swap(arr,i,j);
            }
        }
    }

    static <T> void swap(T[] arr, int i, int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }
}