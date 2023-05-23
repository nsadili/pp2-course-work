package Week11;

public class Calculator {
    interface FuncInter1 {
        int operation(int a, int b);
    }
    
    public static void main(String args[]) {

    FuncInter1 add = (int x, int y)-> x + y;
    
    FuncInter1 multiply = (int x, int y)-> x * y;

    System.out.println(multiply.operation(3,6));

    System.out.println(add.operation(2,7));

    
}

}
