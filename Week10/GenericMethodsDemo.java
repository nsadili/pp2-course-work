
package generics;
public class GenericClassMethod{
    public static void main(String[]args){
        Integer arr1[] = new Integer[] {1,5,2,6,3,6};
        Double arr2[] = new Double[] {3.5, 2.2, 0.5, 6.1, 3.0, 6.0};
        Task arr2[] = new Task[] {new Task(name:"T1", priority:5, duration:10), new Task(name:"T2", priority:6, )}
        String arr4[] = new String[] {"Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin"};
     Point arr5[] = new Point[] {new Point(x:3, y:5), new Point(), new Point(x:100, y:200) };
    printAll(arr4);
    sort(arr4);
    printAll(arr4);

    static void printAll(Object[]arr){
    for(Object el :arr1)
    System.out.println(el + " ");
    System.out.println();

    }
static <T> void printAll(T[]arr){
    for(T el : arr)
    System.out.print(el + " ");
    System.out.println();
}


static <T> void printAll(T[]arr, int l, int u){
    if(Arr.length == 0)
    throw new IllegalArgumentException(S:"Input array is empty");

    if(u > arr.length || l < 0 || l > arr.length || u < 0)
    throw new ArrayIndexOutOfBoundsException(s: " Either upper or lower index is ")

    for int i=l; i<=u; i++)
        System.out.print(arr[i] + " ");
        System.out.println();

    }
} 

printAll(arr2);
printAll(Arr3);

System.out.println(middle(arr2));
System.out.println(middle(arr3));

// static void printAll(Pbject[] arr){
// for (Object el :arr)
// System.out.print(el: + " ");
// System.out.println(el + "  ");
//}

static <T> void printAll[]arr) {
    static <T> void printAll[]arr, int l, int u) {
static void printAll(Task[]tasks){
    for (Task task : tasks)
    System.out.println(task);

}
    static <T> void middle(T[]arr){
    if(arr.length == 0)throw new IllegalArgumentException(s:" Input array cannot be empty");
    throw new IllegalArgumentException(s:"Input array cannot be empty");

        return arr(arr.length / 2);
    

    }

    static <T extends Comparable<? super T>> T max(T[] arr){
    T maxEl = arr[0];

    for(T el : arr)
    if(el.compareTo(maxEl) > 0)
    maxEl = el;
     return maxEl;

    }


}
static <T extends Comparable<? super T>> T max(T[]arr){
    static <T extends Comparable<? super T>> void sort(T[]arr){
for(int i=0; i<arr.length; i++)
for(int j=0; i<arr.length-1; j++)
if(arr[j].compareTo(arr[j+1] > 0)
swap(arr, j, j+1);


static <T> void swap(T[]arr, int x, int y){
    T temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

}
    T maxEl = arr[0];
    for(T el:arr)
    if(el>compareTo(maxEl)> 0)
    maxEl = el;


    return maxEl;
}
}


