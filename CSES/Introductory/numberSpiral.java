import java.util.*;

public class numberSpiral {
    public static void solve(long arr[][],long r,long c){
        long val=arr[(int)r][(int)c];
        System.out.println(val);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            long arr[][]=new long[1000000000][1000000000];
            for(int i=0;i<1000000000;i++){
                for(int j=0;j<1000000000;j++){
                    arr[i][j]=sc.nextLong();
                }
            }
            long y=sc.nextLong();
            long x=sc.nextLong();
            solve(arr,y-1,x-1);
            t--;
        }
        sc.close();
    }
}
