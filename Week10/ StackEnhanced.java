public class Stack<E> {
    private int size;
    private Object[] elements;

    public Stack(int capacity) {
        elements = new Object[capacity];
    }

    public void push(E element) {
        if (size == elements.length) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        E element = (E) elements[--size];
        elements[size] = null;
        return element;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        return (E) elements[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);

        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println("Size: " + stack.size()); // prints "Size: 3"

        System.out.println(stack.pop()); // prints "three"
        System.out.println(stack.pop()); // prints "two"

        stack.push("four");
        stack.push("five");
        stack.push("six"); // throws an exception

        System.out.println(stack.peek()); // prints "five"
    }
}

