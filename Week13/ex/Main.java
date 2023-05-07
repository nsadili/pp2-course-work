

public class Main{
    public static void main(String[] args) {
        int CORE_COUNT = Runtime.getRuntime().availableProcessors(); 
        Parallel[] threads = new Parallel(CORE_COUNT);
       
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < CORE_COUNT; i++){
            threads[i] = new Parallel(i + 1);
            threads[i].start();
        }

        try{
            for (int i = 0; i < CORE_COUNT; i++){
                threads[i].join();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - startTime);
       
        long sum = 0;
        for (int i = 0; i < CORE_COUNT; i++){
           sum += threads[i].getSum();
        }
    }
}
    
