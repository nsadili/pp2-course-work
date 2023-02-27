public class A {
    

    class ClassA {
        public void methodOne(int i) {}
        public void methodTwo(int i) { }
        public static void methodThree(int i) {}
        public static void methodFour(int i) {}
       }
       class ClassB extends ClassA {
       // public static void methodOne(int i) { }
        public void methodTwo(int i) {}
     // public void methodThree(int i) {}
        public static void methodFour(int i) {}
       }

       //* Method one and Method Three will not be compiled. 
}