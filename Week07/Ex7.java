package Week07;

public class Ex7 {

   static class Stack {
       private int[] elements;
       private int top;
       private int size;

       public Stack(int size) {
           this.size = size;
           elements = new int[size];
           top = -1;
       }

       public void push(int element) throws FullStackException {
           if (top == size - 1) {
               throw new FullStackException();
           }
           top++;
           elements[top] = element;
       }

       public int pop() throws EmptyStackException {
           if (top == -1) {
               throw new EmptyStackException();
           }
           int element = elements[top];
           top--;
           return element;
       }

       public int peek() throws EmptyStackException {
           if (top == -1) {
               throw new EmptyStackException();
           }
           return elements[top];
       }

       public void printStack() {
           if (top == -1) {
               System.out.println("Stack is empty.");
               return;
           }
           System.out.println("Stack: ");
           for (int i = top; i >= 0; i--) {
               System.out.print(elements[i] + " ");
           }
           System.out.println();
       }
   }

   static class EmptyStackException extends Exception {
       public EmptyStackException() {
           super("Stack is empty.");
       }
   }

   static class FullStackException extends Exception {
       public FullStackException() {
           super("Stack is full.");
       }
   }

   public static void main(String[] args) {
       Stack stack = new Stack(5);

       try {
           stack.push(3);
           stack.push(5);
           stack.push(7);
           stack.push(10);
           stack.push(100);
       } catch (FullStackException e) {
           System.out.println(e.getMessage());
       }

       stack.printStack();

       try {
           System.out.println("Peek: " + stack.peek());
           System.out.println("Pop: " + stack.pop());
           System.out.println("Pop: " + stack.pop());
           System.out.println("Pop: " + stack.pop());
           System.out.println("Pop: " + stack.pop());
           System.out.println("Pop: " + stack.pop());
       } catch (EmptyStackException e) {
           System.out.println(e.getMessage());
       }

       stack.printStack();
   }
}
