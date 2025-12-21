import java.util.*;
public class balanced_round{
    public static void solve(int n,long arr[],long k){
        Arrays.sort(arr);

        int lp=0;
        int rp=1;
        int maxi=0;

        while(rp<n){
            if((arr[rp]-arr[rp-1])>k){
                int len=rp-lp;
                maxi=Math.max(maxi,len);
                lp=rp;
            }
            rp++;
        }
        int len=rp-lp;
        maxi=Math.max(maxi,len);

        System.out.println(n-maxi);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();

            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            solve(n,arr,k);
        }
    }
}