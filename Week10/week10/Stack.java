package pp2.week10;
import java.util.*;
public class Stack <U> {
    private int sizeStack;
    private int capacity;
    private U[] objects;

    public Stack(int capacity) {
        this.sizeStack = 0;
        this.capacity = capacity;
        this.objects = (U[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return sizeStack == 0;
    }

    public boolean isFull() {
        return sizeStack == capacity;
    }

    public void push(U obj) throws Exception {
        if (isFull()) throw new Exception();
        objects[sizeStack++] = obj;
    }

    public U pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return objects[--sizeStack];
    }


    public U peek() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        return objects[sizeStack - 1];
    }

    }