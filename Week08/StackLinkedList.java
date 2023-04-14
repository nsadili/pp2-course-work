public class StackLinkedList {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node top;
    private int size;

    StackLinkedList() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return top.data;
        {


    public static void main(String[] args) throws Exception {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());
    }
} 