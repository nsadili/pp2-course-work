package pp2.week10;
import java.util.*;
public class StackEnhanced <U>
{
    private int sizeStack;
    private int capacity;
    private U[] objects;



    public StackEnhanced(int capacity) {
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