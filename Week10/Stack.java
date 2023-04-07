import java.util.ArrayList;
import java.util.List;

public class Stack <T> {
    private List<T> list;
    private int capacity;
    

  

    public Stack(int capacity) {
        // TODO what is capacity is not a positive integer ?
        if (capacity <= 0) {
            throw new IllegalArgumentException(String.format("<%d> is neative number", capacity));
        }
        this.capacity = capacity;
        list = new ArrayList<T>();

    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == this.capacity;
    }

    public T peek() {
        // TODO: what if the stack is empty? index == 1?
        if (list.size() == 0) {
            throw new StackFullEmptyException("Stack is Empty!");
        }

        return list.get(list.size()-1);
    }

    public T pop() {
        // TODO: what if the stack is empty? index == -1?
        if (list.size() == 0) {
            throw new StackFullEmptyException("Stack is Empty!");
        }
      
       return list.remove(list.size() - 1) ;
    }

    public void push(T el) {
        // TODO: what if the stack is full? index == capacity-1?
        if (list.size() == capacity ) {
            throw new StackFullEmptyException("Stack is Full");
        }
        list.add(el);
    }

   

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <list.size(); i++) {
            System.out.print(" || " + list.get(i));
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(15);
        System.out.println(stack.isEmpty());

        stack.push(5);
        System.out.println(stack.isEmpty());

        stack.push(15);
        stack.push(18);
      
        stack.__print();
        System.out.println(stack.peek());
        stack.push(20);

        System.out.println(stack.pop());
        // stack.pop();
        System.out.println(stack.pop());
       // System.out.println(stack);
        stack.push(19);
        System.out.println(stack.pop());
        stack.pop();
        stack.__print();
        // stack.__print();


         System.out.println(stack.pop());

        //  System.out.println(stack.pop());


        stack.__print();

        // do{
        // try{
        // stack.pop();
        // }catch(StackFullEmptyException e){
        // System.out.println("Error");
        // }
        // stack.push(3);
        // stack.push(5);
        // stack.push(7);
        // stack.push(10);
        // stack.push(100);
        // try {
        // stack.push(200000);
        // } catch (Exception e) {
        // System.out.println("Error2");
        // }
        // break;
        // }while(true);

        // System.out.println(stack.peek());

        // stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

    }
}