import java.util.Scanner;

public class PW17 {
    public static void main(String[] args) {
        Segment ans= arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(ans.length()> arr[i],length()){
                ans= arr[i];
            }
        }
        int countOfMinimumLengthSegments = 0;
        for(int i=1; i<arr.length; i++)
        {
            if(ans.length() == arr[i],length()){
                countOfMinimumLengthSegments++;
            }
        }
        Segment[] result =  new Segment[countOfMinimumLengthSegments];
        int x=0;
        for(int i=1; i<arr.length; i++)
        {
            if(ans.length() == arr[i],length()){
                res[x] =  arr[i];
                x++;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        Segemnt[] segments =  new Segment [n];
        for (int i=0; i<n; i++)
        {
            System.out.println("- - - - - - - - - ");
            System.out.println("Segemnt no:" + i);
            System.out.println("x1 = ");
            float x1 = scanner.nextFloat();
            System.out.println("y1 =");
            float y1 = scanner.nextFloat();
            System.out.println("x2 =");
            float x2 = scanner.nextFloat();
            System.out.println("y2 =");
            float y2 = scanner.nextFloat();
            segments [i] =  new Segment (x1, y1, x2, y2);

        }
        Segment [] answer = getAllAnswers(segments);
        if (answer.length==1)
        {
            System.out.println("There is only 1 such segment:" + answer [0]);
        }
        else{
            System.out.println("There are" + answer.length + "such segments:") ;
            for(Segment segment : answer)
            {
                System.out.println(segment.toString());
            }
        }
    }
}
