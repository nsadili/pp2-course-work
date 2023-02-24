package Week05.ex;

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
            
        
    
/////////////
/*
 Description:

 methodTwo and the methodFour were correct because they are the same
 but methodOne and methodThree are not correct due to the fact that they are not equal
 mehtodOne of class B only hides
 methodThree of the class B only overrides 
 
 */