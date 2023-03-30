import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    private int[] el;
    private int cap;
    private int index;

    
    Deque<Integer> stackList= new LinkedList<Integer>();

    public Stack(int cap) {
        if(cap<=0){
            throw new IllegalArgumentException(String.format("<%d> is negtive",cap));
        }
        this.cap = cap;
        index = -1;
        el = new int[cap];
        
    }

   
    public boolean isEmpty(){
        return stackList.size() == 0;
    }


    public boolean isFull() {
        return stackList.size() == this.cap;
    }

    public int peek() {
        if(index == -1){
            throw new StackIsEmptyException("Stack is empty!");
        }
        
        return stackList.getLast();
    }

    public int pop() {
        if(index == -1){
            throw new StackIsEmptyException("Stack is empty!");
        }
        index--;
        return stackList.removeLast();
    }

    public void push(int el) {
        if(index == cap -1){
            throw new StackIsEmptyException("Stack is Full");
        }
        index++;
       stackList.addLast(el);
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print("||" + el[i]);
        }
        System.out.println("||Top");
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.__print();
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        myStack.__print();
    }
}