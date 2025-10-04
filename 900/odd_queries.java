import java.util.*;
public class odd_queries{
    public static void solve(int l,int r,long arr[],long k,int n){
        long sum=0;
        if(l==0) sum=arr[r];
        else sum=arr[r]-arr[l-1];

        long tot=arr[n-1];

        int len=r-l+1;
        long nsum=k*len;

        long rem=tot-sum+nsum;

        if(rem%2==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();

            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            long pre[]=new long[n];
            pre[0]=arr[0];
            for(int i=1;i<n;i++){
                pre[i]=arr[i]+pre[i-1];
            }
            while(q-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                long k=sc.nextLong();

                solve(l-1,r-1,pre,k,n);
            }
        }
    }
}