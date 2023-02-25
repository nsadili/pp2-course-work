package Week05.EX;

class ClassA {
 public static void methodOne(int i) {}
 public void methodTwo(int i) { }
 public static void methodThree(int i) {}
 public static void methodFour(int i) {}
}
class ClassB extends ClassA {
 public static void methodOne(int i) { }//Won't work(Because static keyword does not match)
 public void methodTwo(int i) {}//Will override the method in the class A(Both are Instance)
 public static void methodThree(int i) {}//Won't work(Because static keyword does not match)
 public static void methodFour(int i) {}//Will hide the method in the class A(Both are static)
}
