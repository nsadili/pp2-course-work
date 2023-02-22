public class MixedString {
    public static void main(String[] args){
        String str = "This is PP2 Fall 2021";

        String[] arr = str.split(" ");
        String[] arr2 = new String[arr.length];

        for(int i = 0; i < arr.length; i ++){
            char[] c = arr[i].toCharArray();
            char temp = c[0];
            c[0] = c[c.length - 1];
            c[c.length - 1] = temp;
            arr2[i] = String.valueOf(c);
            System.out.print(arr2[i] + " ");
        }
    }
}
