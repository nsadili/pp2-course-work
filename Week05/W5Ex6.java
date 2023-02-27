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
/*This code tries to extend class A with itself,
 and it also attempts to override methods like methodOne, 
 methodTwo, methodThree, and methodFour. As a result, 
 there will be an error because this approach is incorrect. */
   