import java.util.*;
public class SumofMedians{
    public static void solve(long arr[],int n,int k){

        long ans=0;
        int median=(n+1)/2;
        if(n==2){
            for(int i=0;i<arr.length;i+=2){
                ans+=arr[i];
            }
        }
        else{
            int len=n-median+1;
            int i=arr.length-len;
            while(k>0 && i>=0){
                ans+=arr[i];
                i-=len;
                k--;
            }
        }

        System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();

            long arr[]=new long[n*k];
            for(int i=0;i<n*k;i++){
                arr[i]=sc.nextLong();
            }

           solve(arr,n,k);
        }
    }
}