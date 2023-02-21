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
   
   //In this code Class A is being extended by class A. More over it overroads methodOne. methodTwo, methodThree and methodFour.
   //Of course there will be error, because the code is written in an incorrect way