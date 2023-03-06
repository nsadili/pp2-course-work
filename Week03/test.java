public class test {
    void print(int value) {
        System.out.println("this is an integer value " + value);
    }
    void print(double value) {
     System.out.println("this is a float value " + value);
    }
    public static void main(String[] args) {
        test printer = new test() ;
       printer.print(234) ;
       printer.print(2.3) ;
    }
}

    

