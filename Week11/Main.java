package Week11;

public class Main {
    interface FuncInter1 {
        int operation(int a, int b);
    }
    interface FuncInter2
    {
        void sayMessage(String message);
    }

    public static void main(String args[]) {

    FuncInter1 add = (int x, int y)-> x + y;
    
    FuncInter1 multiply = (int x, int y)-> x * y;

    FuncInter1 max = (int x, int y) -> ((x>y)?x:y);
    
    FuncInter1 min = (int x, int y) -> ((x>y)?y:x);

    System.out.println(multiply.operation(3,6));
    System.out.println(add.operation(2,7));

    FuncInter2 print = message -> System.out.println("message is : " + message);
    print.sayMessage("Hi");
}

}
