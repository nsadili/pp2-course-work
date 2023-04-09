import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        // TODO what is capacity is not a positive integer ?
        if (capacity < 1) throw new NegativeArraySizeException("Capacity can not be lower than 1");
        this.capacity = capacity;
        this.index = -1;
        this.elements = new ArrayList<>(capacity);
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public T peek() {
        // TODO: what if the stack is empty? index == 1?
        if (this.isEmpty()) throw new ArrayIndexOutOfBoundsException("Stack is empty!");

        return elements.get(index);
    }

    public T pop() {
        // TODO: what if the stack is empty? index == -1?
        if (this.isEmpty()) throw new ArrayIndexOutOfBoundsException("Stack is empty!");

        return elements.remove(index--);
    }

    public void push(T el) {
        // TODO: what if the stack is full? index == capacity-1?
        if (this.isFull()) throw new ArrayIndexOutOfBoundsException("Stack is full!");

        elements.add(++index, el);
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements.get(i));
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        // stack.pop();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        // stack.push(200000);

        stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        
        Stack<String> stringStack = new Stack<>(3);

        stringStack.push("Fisrt");
        stringStack.push("Second");
        stringStack.push("Third");

        stringStack.__print();

    }
}