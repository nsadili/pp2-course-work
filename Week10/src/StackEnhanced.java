import java.util.ArrayList;

public class StackEnhanced<T> {

    private ArrayList<T> stack;
    private int size;
    private int top;

    public StackEnhanced(int size) {
        this.size = size;
        stack = new ArrayList<T>(size);
        top = -1;
    }

    public void push(T item) throws Exception {
        if (top == size - 1) {
            throw new Exception("Stack is full");
        }
        stack.add(++top, item);
    }

    public T pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        return stack.remove(top--);
    }

    public T peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        return stack.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return top + 1;
    }
}
