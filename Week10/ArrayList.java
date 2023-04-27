
public class ArrayList<E> {
    private ArrayList<E> stack;
    private int capacity;
    private int top;

    public ArrayList(int capacity) {
        this.stack = new ArrayList<>(capacity);
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(E element) throws StackFullException {
        if (isFull()) {
            throw new StackFullException("Stack is full");
        }
        stack.add(++top, element);
    }

    private void add(int i, E element) {
    }

    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stack.remove(top--);
    }

    private E remove(int i) {
        return null;
    }

    public E peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stack.get(top);
    }

    private E get(int top2) {
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
