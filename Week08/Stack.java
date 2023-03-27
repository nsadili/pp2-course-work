import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    
    Deque<Integer> stackAsList= new LinkedList<Integer>();

    public Stack(int capacity) {
        // TODO what is capacity is not a positive integer ?
        if(capacity<=0){
            throw new IllegalArgumentException(String.format("<%d> is neative number",capacity));
        }
        this.capacity = capacity;
        index = -1;
        elements = new int[capacity];
        
    }

   
    public boolean isEmpty(){
        return stackAsList.size() == 0;
    }


    public boolean isFull() {
        return stackAsList.size() == this.capacity;
    }

    public int peek() {
        // TODO: what if the stack is empty? index == 1?
        if(index == -1){
            throw new StackFullEmptyException("Stack is Empty!");
        }
        
        return stackAsList.getLast();
    }

    public int pop() {
        // TODO: what if the stack is empty? index == -1?
        if(index == -1){
            throw new StackFullEmptyException("Stack is Empty!");
        }
        index--;
        return stackAsList.removeLast();
    }

    public void push(int el) {
        // TODO: what if the stack is full? index == capacity-1?
        if(index == capacity -1){
            throw new StackFullEmptyException("Stack is Full");
        }
        index++;
        elements[index] = el;
       stackAsList.addLast(el);
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements[i]);
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(15);
        System.out.println(stack.isEmpty());

        stack.push(5);
        System.out.println(stack.isEmpty());  

        stack.push(15);
        stack.push(18);
        System.out.println(stack.stackAsList + "****");
stack.__print();
        System.out.println(stack.peek());
        stack.push(20);

     
       System.out.println(stack.pop());
      //  stack.pop();
       System.out.println(stack.pop());
        System.out.println(stack.stackAsList);
      stack.push(19);
      System.out.println(stack.pop());
      stack.pop();
      //System.out.println(stack.pop());

        stack.__print();



     

    //   do{
    //    try{
    //     stack.pop();
    //    }catch(StackFullEmptyException e){
    //     System.out.println("Error");
    //    }
    //     stack.push(3);
    //     stack.push(5);
    //     stack.push(7);
    //     stack.push(10);
    //     stack.push(100);
    //    try {
    //     stack.push(200000);
    //    } catch (Exception e) {
    //    System.out.println("Error2");
    //    } 
    //     break;
    //   }while(true);

    //      System.out.println(stack.peek());

    //      stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}