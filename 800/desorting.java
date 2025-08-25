import java.util.*;

public class desorting {
    public static void solve(long a[],int n){
        long ans=(long)1e18;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]){
                long diff=a[i+1]-a[i];
                long val=(diff/2)+1;
                ans=Math.min(ans,val);
            }
            else ans=0;
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            solve(arr,n);
            t--;
        }
    }
}
