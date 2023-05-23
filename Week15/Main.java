package Week15;

public class Main {
    public static void main(String args[]) {
        
        NumberTest<Integer> func = (str1, str2) -> System.out.println(str1+" "+str2);

        func.print("Hello World"); 
    }
    }