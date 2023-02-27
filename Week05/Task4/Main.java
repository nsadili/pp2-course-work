public class Main {
    public static void main(String[] args) {
        GeneralType g = new GeneralType();
        System.out.println(g);
        //First static initializations are executed regarding super or subclass (Static blocks of super classes are executed first).
        //So, firstly it prints AS because it is static block of super class.Then, it prints GTS as there is no static left in super class, and compiler searches for static in subclass.
        //Afterward, compiler searches for instance blocks in super classes, and it prints A, then it tries to finalize super class printing the constructors of it.So, it prints 5 + AC (empty constructor has not been compiled).
        //Then it prints AC and after finalizing all the stuff in super class it moves to subclass and tries to finalize it.
        //At the end, it prints GT and GTC successively.
    }
}