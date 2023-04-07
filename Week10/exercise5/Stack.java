package exercise5;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E> {

    private List<E> elements; // list to hold the stack elements
    private int maxSize; // maximum size of the stack
    private int top; // index of the top element in the stack

    // Constructor to create an empty stack with specified maximum size
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new ArrayList<>(maxSize);
        this.top = -1;
    }

    // Pushes the specified element onto the top of the stack
    public void push(E element) {
        if (top == maxSize - 1) {
            throw new StackOverflowError("Stack is full!");
        }
        elements.add(++top, element);
    }

    // Removes and returns the top element from the stack
    public E pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements.remove(top--);
    }

    // Returns the top element of the stack without removing it
    public E peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements.get(top);
    }

    // Returns the number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return top == -1;
    }

    // Returns true if the stack is full, false otherwise
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
