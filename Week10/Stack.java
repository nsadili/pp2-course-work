import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> elements;   
    private int capacity;

    public Stack(int capacity) {
        if (capacity<0){
            throw new NegativeArraySizeException("You cannot write a negative number as a capacity!");
        }
        this.capacity = capacity;
        this.elements = new ArrayList<T>(capacity);
    }

    public boolean isEmpty() {
        return elements.size() == -1;
    }

    public boolean isFull() {
        return elements.size()== capacity;
    }

    public T peek() {
        if (this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack is empty, you cannot peek!");
        }
        return elements.get(elements.size()-1);
    }

    public T pop() {
        if (this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack is empty, you cannot pop!");
        }
        return elements.remove(elements.size()-1);
    }

    public void push(T el) {
        if (this.isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack is full, you cannot push!");
        }
        elements.add(el);
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(" || " + elements.get(i));
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        // System.out.println(stack.peek());
        // stack.pop();

        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        stack.pop();
        
        
        
        
        // stack.push(200000);
        //System.out.println(stack);
         stack.__print();
        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }
        System.out.println(stack.peek());


    }
}