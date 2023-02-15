class Array {
    public static void main(String args[]) {
        int arr[]=  {-45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};

        int min=arr[0];
        int max=arr[0];

        for(int x:arr) {
            if(x>max) max=x;
            if(x<min) min=x;
        }

        System.out.println("min: "+min+" max: "+max);
    }
}