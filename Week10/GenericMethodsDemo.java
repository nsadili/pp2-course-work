public class GenericMethodsDemo {
    public static void main(String[] args) {

        Integer arr1[] = new Integer[] { 2, 4, 5, 6, 5,8 };
        Double arr2[] = new Double[] { 3.4, 3.5, 2.5, 6.0, 4.6, 7.2 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T3", 9, 50),
                new Task("T4", 15, 23) };
        String arr4[] = new String[] { "Bahruz", "Zeyneb", "Rufet", "Nazerin", "Tunar", "Ali" };
        Point arr5[] = new Point[] { new Point(2, 6), new Point(), new Point(354, 76) };

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
            throw new ArrayIndexOutOfBoundsException("Lower or Upper bound is incorrect");

        for (var i = lower; i <= upper; i++) 
        {
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
        if(arr.length == 0) throw new IllegalArgumentException("Length equals to 0");

        return arr[arr.length / 2];
    }

    static <T extends Comparable<? super T>> T max(T[] arr) {
        if(arr.length==0) throw new IllegalArgumentException("Length equals to 0");
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

    static <T> void swap(T[] arr, int i, int j)
    {
        T temp=arr[i];

        arr[i]=arr[j];

        arr[j] =temp;
    }

}