public class Stack<P> {

    private P[] stackArray;
    private int stackSize;
    private int top;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = (P[]) new Object[stackSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackSize - 1);
    }

    public void push(P el) throws Exception {
        if (this.isFull()) {
            throw new Exception("Stack overflows");
        }
        System.out.println("Adding: " + el);
        this.stackArray[++top] = el;
    }

    public P pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack underflows");
        }
        P el = this.stackArray[top--];
        System.out.println("Removing: " + el);
        return el;
    }

    public P peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return this.stackArray[top];
    }

    public static void main(String args[]){
		try {
			Stack<String> stringStack = new Stack<String>(5);
			stringStack.push("Raiq");
			Stack<Integer> integerStack = new Stack<Integer>(5);
			integerStack.push(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}