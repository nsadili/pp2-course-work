public class Stack<T> {

    private T[] stackArray;
    private int stackSize;
    private int top;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackSize - 1);
    }

    public void push(T el) throws Exception {
        if (this.isFull()) {
            throw new Exception("Stack overflows");
        }
        System.out.println("Adding: " + el);
        this.stackArray[++top] = el;
    }

    public T pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack underflows");
        }
        T el = this.stackArray[top--];
        System.out.println("Removing: " + el);
        return el;
    }

    public T peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return this.stackArray[top];
    }

    public static void main(String args[]){
		try {
			Stack<String> stringStack = new Stack<String>(5);
			stringStack.push("Jala");
			Stack<Integer> integerStack = new Stack<Integer>(5);
			integerStack.push(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
