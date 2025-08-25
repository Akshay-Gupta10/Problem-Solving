import java.util.*;
public class jellyfish_and_undertale{
    public static long solve(long a,long b,long arr[]){
        int n=arr.length;

        long ans=b;
        for(int i=0;i<n;i++){
            if(arr[i]>=a){
                ans+=(a-1);
            }
            else{
                ans+=arr[i];
            }
        }

        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            int n=sc.nextInt();

            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            long ans=solve(a,b,arr);
            System.out.println(ans);
        }
    }
}