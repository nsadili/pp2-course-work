public class Stack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    @SuppressWarnings("unchecked")
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = (T[]) new Object[maxSize];
    }

    public void push(T value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push a new element.");
        }
        stackArray[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop an element.");
        }
        return stackArray[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek an element.");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(3);

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        System.out.println("Peek: " + integerStack.peek());

        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
    }
}
