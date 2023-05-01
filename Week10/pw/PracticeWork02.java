package Week10.pw;

public class PracticeWork02 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(5); 
        try {
            integerStack.push(1);
            integerStack.push(2);
            integerStack.push(3);
            integerStack.push(4);
            integerStack.push(5);
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

    static class Stack<T> {
        private T[] elements;
        private int top;
        private int maxSize;

        public Stack(int maxSize) {
            this.maxSize = maxSize;
            top = -1;
        }

        public void push(T element) throws StackOverflowException {
            if (top == maxSize - 1) {
                throw new StackOverflowException("Stack is full");
            }
            elements[++top] = element;
        }

        public T pop() throws StackUnderflowException {
            if (top == -1) {
                throw new StackUnderflowException("Stack is empty");
            }
            return elements[top--];
        }

        public T peek() throws StackUnderflowException {
            if (top == -1) {
                throw new StackUnderflowException("Stack is empty");
            }
            return elements[top];
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i <= top; i++) {
                sb.append(elements[i]);
                if (i != top) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
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
}

