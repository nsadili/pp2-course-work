package generics;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };
      
    printAll(arr1);

   // printAll(arr2, 2,4);
    // printAll(arr3);
    // System.out.println(max(arr2));
     //System.out.println(max(arr3));
     sort(arr1);
     printAll(arr1);
     //swap(arr1, 3, 4);
     
    }

    static <T> void printAll(T[] arr){
       // for(T el : arr)
       // System.out.println(el + " ");
        //System.out.println();
      printAll(arr,0,arr.length-1);
    }

    static <T> void printAll(T[] arr, int l, int u){
        if(arr.length == 0)
        throw new IllegalArgumentException("Input array is empty");

        if(u>=arr.length || l<0 || l>=arr.length || u<0 )
        throw new ArrayIndexOutOfBoundsException("Either upper or lower index is out of bounds");

        for(int i=l; i<=u; i++){
            System.out.print(arr[i] +  " ");
            System.out.println();
        }

    }

static void printAll(Task[] tasks){
for(Task task : tasks)
System.out.println(task);
}

static <T> T middle(T[] arr){

if(arr.length  == 0)
throw new IllegalArgumentException("Input array cant be empty");

    return arr[arr.length / 2];

}

static <T extends Comparable<? super T>> T max(T[] arr){

T maxEl = arr[0];
for(T el : arr)
if(el.compareTo(maxEl)> 0)
maxEl = el;

    return maxEl;
}

static <T extends Comparable<? super T>> void sort(T[] arr){
    for(int i=0; i<arr.length-1;i++)
    for(int j=0; j<arr.length-1;j++)
    if(arr[j].compareTo(arr[j+1])>0)
    swap(arr, j, j+1);
}

static <T> void swap(T[]arr, int x, int y){
T temp = arr[x];
arr[x] = arr[y];
arr[y] = temp;


}
}
