public class Stack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = (T[]) new Object[size];
    }

    public void push(T element) throws StackOverflowException {
        if (top == maxSize - 1) {
            throw new StackOverflowException("Stack is full!");
        }
        stackArray[++top] = element;
    }

    public T pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty!");
        }
        T element = stackArray[top--];
        return element;
    }

    public T peek() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty!");
        }
        T element = stackArray[top];
        return element;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            // Attempting to push a new element when the stack is full
            stack.push(6);
        } catch (StackOverflowException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Attempting to pop an element when the stack is empty
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}
