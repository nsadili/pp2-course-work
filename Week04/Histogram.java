import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number of students: ");
        int length = scan.nextInt();
        int Grades[] = new int[length];
        int cnt = 0;
        System.out.println("Insert the grades of students: ");
        for (int i : Grades) {
            Grades[cnt++] = scan.nextInt();
        }
        int cnt0 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0, cnt9 = 0,
                cnt10 = 0;
        for (int i : Grades) {
            switch (Grades[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt3++;
                    break;
                case 3:
                    cnt3++;
                    break;
                case 4:
                    cnt4++;
                    break;
                case 5:
                    cnt5++;
                    break;
                case 6:
                    cnt6++;
                    break;
                case 7:
                    cnt7++;
                    break;
                case 8:
                    cnt8++;
                    break;
                case 9:
                    cnt9++;
                    break;
                case 10:
                    cnt10++;
                    break;
            }
        }
        int mode=cnt0;
        if(mode<cnt1) mode=cnt1;
        if(mode<cnt2) mode=cnt2;
        if(mode<cnt3) mode=cnt3;
        if(mode<cnt4) mode=cnt4;
        if(mode<cnt5) mode=cnt5;
        if(mode<cnt6) mode=cnt6;
        if(mode<cnt7) mode=cnt7;
        if(mode<cnt8) mode=cnt8;
        if(mode<cnt9) mode=cnt9;
        if(mode<cnt10) mode=cnt10;
        cnt=0;
        double mean=0;
        for(int i : Grades){
            mean+=Grades[cnt++];
        }
        mean/=cnt;
        
        cnt=0;
        int Gr[] = new int[length];
        while(cnt0>0){
            Gr[cnt++]=0;
        }
        while(cnt1>0){
            Gr[cnt++]=1;
        }
        while(cnt2>0){
            Gr[cnt++]=2;
        }
        while(cnt3>0){
            Gr[cnt++]=3;
        }
        while(cnt4>0){
            Gr[cnt++]=4;
        }
        while(cnt5>0){
            Gr[cnt++]=5;
        }
        while(cnt6>0){
            Gr[cnt++]=6;
        }
        while(cnt7>0){
            Gr[cnt++]=7;
        }
        while(cnt8>0){
            Gr[cnt++]=8;
        }
        while(cnt9>0){
            Gr[cnt++]=9;
        }
        while(cnt10>0){
            Gr[cnt++]=10;
        }
        float median;
        if(length%2==0) median=(float) (Gr[length/2]+Gr[(length/2)+1])/2;
        else median=Gr[length/2];
        System.out.printf("Mean: %.2f\nMode: %d\nMedian: %.2f",mean,mode,median);
    }



}
