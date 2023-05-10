public class CPUCores {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of CPU cores: " + cores);
    }
}
