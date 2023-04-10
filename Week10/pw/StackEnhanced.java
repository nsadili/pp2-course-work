public class StackEnhanced<T> {
    private T[] stack;
    private int t;
    private int c;

    public StackEnhanced(T[] stack, int t, int c){
        this.stack = (T[]) new Object[c];
        this.t = -1;
        this.c = c; 
    }

    public void push(T el){
        if(t == c - 1){
            throw new IllegalStateException("Stack is full");
        
        }
        t++;
        stack[t] = el;

    }

    public T pop(){
        if(t == -1){
            throw new IllegalStateException("Stack is empty");
        
        }
        T el = stack[t];
        stack[t] = null;
        t--;
        return el;

    }

    public T peek(){
        if(t == -1)
        throw new IllegalStateException("Stack is empty");
        return stack[t];
    }
    
}
