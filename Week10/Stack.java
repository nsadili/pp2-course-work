import java.util.ArrayList;

public class Stack<T> {
    private T[] elements;
    private Integer capacity;
    private Integer index;

    public Stack(int cap) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(String.format("<%d> is neative number", capacity));
        }
        this.capacity = cap;
        this.index = -1;
        this.elements = new T[this.capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public T peek() {
        return elements[index];
    }

    public T pop() {
        return elements[index--];
    }

    public void push(T el) {
        elements[++index] = el;
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
        Stack<Integer> stack = new Stack<Integer>(5);
        do {
            try {
                stack.pop();
            } catch (SecurityException e) {
                System.out.println("Error");
            }
            stack.push(3);
            stack.push(5);
            stack.push(7);
            stack.push(10);
            stack.push(100);
            try {
                stack.push(200000);
            } catch (Exception e) {
                System.out.println("Error2");
            }
            break;
        } 
        while (true);

    }
}