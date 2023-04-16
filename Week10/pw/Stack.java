import java.util.EmptyStackException;

public class Stack<T> {
    private int size;
    private int top;
    private T[] stackArray;
    
    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stackArray = (T[]) new Object[size];
    }
    
    public void push(T element) throws Exception {
        if (top == size - 1) {
            throw new Exception("Stack is full");
        }
        top++;
        stackArray[top] = element;
    }
    
    public T pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        T element = stackArray[top];
        top--;
        return element;
    }
    
    public T peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
}
