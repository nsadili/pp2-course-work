package generics;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

public class StackEnhanced<T> {


    private List<T> elements1 = new ArrayList<>();
    //elements1 = new ArrayList<>();



    private int[] elements;
    private int capacity;
    private int index;

    public StackEnhanced(int capacity, T[] elements, T index) {
        // TODO what is capacity is not a positive integer ?
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];
    }

    public <T> boolean isEmpty() {
        return this.index == -1;
    }

    public <T> boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() {

        // TODO: what if the stack is empty? index == 1?
        return elements[index];

    }

    public int pop() {

        // TODO: what if the stack is empty? index == -1?

        return elements[index--];
    }

    public void push(int el) {
        // TODO: what if the stack is full? index == capacity-1?

        elements[++index] = el;
    }

    public <T> void __print() {
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
        StackEnhanced stack = new StackEnhanced<>(5);

        if (stack.isFull())
            throw new IllegalArgumentException("The stack is full");

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);

        if (stack.isEmpty())
            throw new IllegalArgumentException("The stack is empty");
        stack.pop();
        stack.pop();

        stack.__print();

    }
}
