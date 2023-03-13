public class Stack {
    private int[] data;
    private int top;

    public Stack(int size) {
        data = new int[size];
        top = -1;
    }

    public void push(int value) throws StackFullException {
        if (top == data.length - 1) {
            throw new StackFullException();
        }
        top++;
        data[top] = value;
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
        int value = data[top];
        top--;
        return value;
    }

    public int peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException();
        }
        return data[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Top element: " + stack.peek());
            stack.pop();
            System.out.println("Top element: " + stack.peek());
            stack.pop();
            System.out.println("Top element: " + stack.peek());
            stack.pop();
            System.out.println("Top element: " + stack.peek());
            stack.pop();
        } catch (StackFullException e) {
            System.out.println("Stack is full.");
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty.");
        }
    }
}

class StackFullException extends Exception {
}

class StackEmptyException extends Exception {
}
