package generics;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printAll(arr1);
        sort(arr1);
        printAll(arr1);
        
        printAll(arr2);
        printAll(arr4);
        printAll(arr5);
        printAll(arr1, 1, 2);
        printAll(arr3);
        System.out.println("Middle element of 2: "+middle(arr2));
        System.out.println("Middle element of task: "+middle(arr3));
        System.out.println("MAX 1: "+max(arr1));
        System.out.println("MAX 3: "+max(arr3));

        
       
    }

    // public static void printAll(Object[] arr){
    //     for(var x: arr){
    //         System.out.println(x+" ");
    //     }
    //     System.out.println();
    // }

    public static <T> void printAll(T[] arr){
        for(T x: arr)
            System.out.print(x+" ");
        System.out.println();
        printAll(arr, 0, arr.length-1);
    }


    public static <T> void printAll(T[] arr, int l, int u){
        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("Input array is empty");
        }

        if(u>=arr.length || l<0 || l>=arr.length || u<0){
            throw new ArrayIndexOutOfBoundsException("Either upper or lower index is out");
        }
        for(int i=l;i<=u;i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }

    public static void printAll(Task[] tasks){
        for(var x: tasks){
            System.out.println(x);
        }
    }

    public static <T> T middle(T[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Array cannot be emtpy!");
        }
        return arr[arr.length/2];
    }

    public static <T extends Comparable<? super T>> T max(T[] arr){
        T mx = arr[0];
        for(T x: arr){
            if(x.compareTo(mx)>0){
                mx=x;
            }
        }

        return mx;
    }

    public static <T extends Comparable<? super T>> void sort(T[] arr){
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<arr.length;i++){
                if(arr[i].compareTo(arr[i+1])>1){
                    swap(arr, i, i+1);
                }
            }
        }
    }

    static<T> void swap(T[] arr, int x, int y){
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;    
    }
}