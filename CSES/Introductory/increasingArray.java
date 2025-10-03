import java.util.*;

public class increasingArray {
    public static long solve(long arr[],int n){
        long cnt=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                cnt+=(arr[i-1]-arr[i]);
                arr[i]=arr[i-1];
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(solve(arr,n));
        sc.close();
    }
}
