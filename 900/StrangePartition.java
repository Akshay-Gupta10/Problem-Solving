import java.util.*;
public class StrangePartition{
    public static void solve(long arr[],long x){
        int n=arr.length;
        long maxi=0;
        long mini=0;

        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxi+=(arr[i]/x);
            if(arr[i]%x!=0){
                maxi++;
            }
        }

        mini=sum/x;
        if(sum%x!=0) mini++;
       

        System.out.println(mini+" "+maxi);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long x=sc.nextLong();

            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

           solve(arr,x);
        }
    }
}