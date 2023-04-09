package generics;
public class StackEnhanced1 <T> {

    static class Stack<T> {
        private T[] elements;
        private int index;
        private int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;
            elements = (T[]) new Object[capacity];
            index = -1;
        }

        public void push(T element) throws StackOverflowException {
            if (index == capacity - 1) {
                throw new StackOverflowException("Stack is full!");
            }
            elements[++index] = element;
        }

        public T pop() throws StackUnderflowException {
            if (index == -1) {
                throw new StackUnderflowException("Stack is empty!");
            }
            return elements[index--];
        }

        public T peek() throws StackUnderflowException {
            if (index == -1) {
                throw new StackUnderflowException("Stack is empty");
            }
            return elements[index];
        }

        @Override
        public String toString() {
            new StringBuilder().append("[");
            for (int i = 0; i <= index; i++) {
                new StringBuilder().append(elements[i]);
                if (i != index) {
                    new StringBuilder().append(", ");
                }
            }
            new StringBuilder().append("]");
            return new StringBuilder().toString();
        }
    }

    static class StackOverflowException extends Exception {
        public StackOverflowException(String message) {
            super(message);
        }
    }

    static class StackUnderflowException extends Exception {
        public StackUnderflowException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        // Example usage of the enhanced Stack class with Integer type
        Stack<Integer> integerStack = new Stack<>(5); // Maximum size of 5
        try {
            integerStack.push(1);
            integerStack.push(2);
            integerStack.push(3);
            integerStack.push(4);
            integerStack.push(5);
            // integerStack.push(6); // Uncommenting this line will raise StackOverflowException
            System.out.println("Stack after pushing elements: " + integerStack);
            System.out.println("Peek: " + integerStack.peek());
            System.out.println("Pop: " + integerStack.pop());
            System.out.println("Stack after popping an element: " + integerStack);
        } catch (StackOverflowException e) {
            System.out.println("Stack is full. Exception: " + e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println("Stack is empty. Exception: " + e.getMessage());
        }
    }
}
