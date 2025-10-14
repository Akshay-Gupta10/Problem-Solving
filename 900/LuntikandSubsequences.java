import java.util.*;
public class LuntikandSubsequences{
    public static void solve(long arr[],int n){
        int z=0;
        int o=0;

        for(long val:arr){
            if(val==0) z++;
            else if(val==1) o++;
        }

        if(o==0){
            System.out.println(0);
            return;
        }

        long ans=o*(long)Math.pow(2,z);
        System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long arr[]=new long[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            solve(arr,n);
        }
    }
}