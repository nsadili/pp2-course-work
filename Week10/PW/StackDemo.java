public class StackDemo {
    public static void main(String[] args) {
      StackEnhanced<Integer> stack = new StackEnhanced<>(new Integer[8], 1, 5);
      for(int i=0; i < 9; i++)
      try{
          stack.push(i);
          System.out.println(i);
      }catch(IllegalStateException e){
          System.out.println(e.getMessage());
  
      }
  
    }  
  }