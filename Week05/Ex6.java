package Week05;

public class Ex6 {
    class ClassA {
        public void methodOne(int i) {}
        public void methodTwo(int i) { }
        public static void methodThree(int i) {}
        public static void methodFour(int i) {}
       }
       class ClassB extends ClassA {
        public static void methodOne(int i) { }
        public void methodTwo(int i) {}
        public void methodThree(int i) {}
        public static void methodFour(int i) {}
       }
}

/* ClassB extends ClassA, meaning that ClassB is a subclass of ClassA and inherits all the non-private members of ClassA.
 * The methods that are being overridden in ClassB are methodTwo() and methodFour(), while the methods that are being hidden are methodOne() and methodThree().
 * There is an error in the code.
 */
