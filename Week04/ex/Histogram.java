import javax.swing.text.PlainView;

public class Histogram {
    public static void main(String[] args) {
        
        int arr[];
        arr=new int[]{1,2,3,4,5,5,4,3,7,8,9,6,2,3,1,0,0,0,6,9,4};
        
        int show[]=new int[12];

        for(int x:show){
            x=0;
        }

        for(int x:arr){
            if(x==0) show[0]++;
            else if(x==1) show[1]++;
            else if(x==2) show[2]++;
            else if(x==3) show[3]++;
            else if(x==4) show[4]++;
            else if(x==5) show[5]++;
            else if(x==6) show[6]++;
            else if(x==7) show[7]++;
            else if(x==8) show[8]++;
            else if(x==9) show[9]++;
            else if(x==10) show[10]++;


        }

        System.out.println("0 grades: " + show[0]);
        


    }

    public static void mmm(int[] arr,int[] show){

        double mean=0.0;

        var sum=0.0;
        var n=0;
        var mode=0;

        for(int i=1;i<11;i++){

            sum+=i*show[i];
            n+=show[i];

            if(mode<show[i])
        }

        mean=sum/n;



    }


}
