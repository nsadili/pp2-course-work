package generics;

public class SpecificElement {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        try {
            myStack.push(6);
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }

        try {
            while (!myStack.isEmpty()) {
                System.out.println(myStack.pop());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }

    }

    public class Stack<T> {
        private T[] items;
        private int top;

        public Stack(int capacity) {
            items = (T[]) new Object[capacity];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == items.length - 1;
        }

        public void push(T item) throws Exception {
            if (isFull()) {
                throw new Exception("Stack is full");
            }
            items[++top] = item;
        }

        public T pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return items[top--];
        }

        public T peek() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            return items[top];
        }
    }

}
