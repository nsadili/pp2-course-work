import java.util.EmptyStackException;

public class StackEnhanced<T> {

    private T[] stack;
    private int top;

    public StackEnhanced(int size) {
        stack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T element) throws Exception {
        if (top == stack.length - 1) {
            throw new Exception();
        }
        top++;
        stack[top] = element;
    }

    public T pop() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        }
        T element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    public T peek() throws EmptyStackException {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int size() {
        return top + 1;
    }

}
