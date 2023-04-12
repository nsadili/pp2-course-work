package Week10.generics;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();
    private int capacity;

    public Stack(int capacity){
        this.stack = new ArrayList<>(capacity);
        this.capacity = capacity;
    }
    public void add(T el){
        stack.add(el);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public boolean isFull(){
        return stack.size() == capacity;
    }

    public T peek(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stack is empty, can not peek.");
        }
        return stack.get(stack.size()-1);
    }
    public T pop() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Stack is empty, can not pop.");
        return stack.remove(stack.size() - 1);
    }

    public void push(T el) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("Stack is full, can not push.");
        stack.add(el);
    }

    public void print(){
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(" | " + stack.get(i));
        }
        System.out.println(" | Top");
    }


    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(4);
        stack.print();
        stack.add("Nijat");
        stack.add("Ben");
        stack.add("Huseyn");
        stack.print();
        stack.peek();
        stack.print();
        stack.push("Aykhan");
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();

    }
}
