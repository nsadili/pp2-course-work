

class Stack<T>{
    private int size;
    private int top;
    private T[] stackArray;
    
    public Stack(int size) {
        this.size = size;
        top = -1;
        stackArray = (T[]) new Object[size];
    }
    
    public void push(T value) throws StackOverflowException {
        if (top == size - 1) {
            throw new StackOverflowException("Stack is full");
        }
        
        stackArray[++top] = value;
    }
    
    public T pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is full");
        }
        
        return stackArray[top--];
    }
    
    public T peek() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is full");
        }
        
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public int size() {
        return size;
    }
    
    public int count() {
        return top + 1;
    }
}
