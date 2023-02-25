public class Hw6Ex05 {
    public static void main(String[] args) {
        

    }

    class ClassA {

        public void methodOne(int i) {}
        public void methodTwo(int i) { }
        public /* static */ void methodThree(int i) {} // static ???
        public static void methodFour(int i) {}
       }


       class ClassB extends ClassA {

        public /* static */ void methodOne(int i) { }   // static ???
        public void methodTwo(int i) {}
        public void methodThree(int i) {}
        public static void methodFour(int i) {}
       }

       
}
