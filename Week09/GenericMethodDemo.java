public class GenericMethodsDemo {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[] { 1, 5, 2, 6, 3, 6 };
        Double arr2[] = new Double[] { 3.5, 2.2, 0.5, 6.1, 3.0, 6.0 };
        Task arr3[] = new Task[] { new Task("T1", 5, 10), new Task("T2", 6, 30), new Task("T1", 9, 50) };
        String arr4[] = new String[] { "Maryam", "Abdulla", "Nihad", "Asim", "Shamsi", "Nazrin" };
        Point arr5[] = new Point[] { new Point(3, 5), new Point(), new Point(100, 200) };

        printAll(arr1);
        printAll(arr3);
        
       
    }
    

    /*static void printAll(Object[] arr) {
    	for (Object x : arr) {
    		System.out.print(x + "");
    		System.out.println();
    	}
    
    }
    */
    
 
    	static <K> void printAll(K[] arr) {
    	for(K x : arr) {
    		System.out.println(x + " ");
    		System.out.println();
    	}
    	}
   
}