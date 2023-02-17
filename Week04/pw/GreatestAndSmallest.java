package Week04.pw;

public class GreatestAndSmallest {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = Integer.parseInt(args[1]);
        }
        System.out.println(minimum(array));
        System.out.println(maximum(array));
    }
    public static int minimum(String[] array) {
        int min = Integer.parseInt(array[0]);
        for (String j: array) {
            if(Integer.parseInt(j) > min) min = Integer.parseInt(j);
        }
        return min;
    }
    
    public static int maximum(String[] array) {
        int max = Integer.parseInt(array[0]);
        for (String l: array) {
            if(Integer.parseInt(l) > max) max = Integer.parseInt(l);
        }
        return max;
    }
    public static int minimum(int[] array) {
        int min = array[0];
        for (int j: array) {
            if(j < min) min = j;
        }
        return min;
    }
    
    public static int maximum(int[] array) {
        int max = array[0];
        for (int l: array) {
            if(l > max) max = l;
        }
        return max;
    }
}

/*public class GreatestAndSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many elements you want to input: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Minimum is: "+minimum(array));
        System.out.println("Maximum is: "+maximum(array));
    }
    public static int minimum(int[] array) {
        int min = array[0];
        for (int j: array) {
            if(j < min) min = j;
        }
        return min;
    }
    
    public static int maximum(int[] array) {
        int max = array[0];
        for (int l: array) {
            if(l > max) max = l;
        }
        return max;
    }
}
*/
