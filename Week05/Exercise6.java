package week05;

public class Exercise6 {
    class ClassA {
        public void methodOne(int i) {}
        public void methodTwo(int i) { }
        public static void methodThree(int i) {}
        public static void methodFour(int i) {}
    }
    class ClassB extends ClassA {
        // Can't override because it has different signature
//        public static void methodOne(int i) { }
        public void methodTwo(int i) {}
        // Can't override because it has different signature
//        public void methodThree(int i) {}
        public static void methodFour(int i) {}
    }
}
