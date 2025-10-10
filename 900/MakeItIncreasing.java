import java.util.*;
public class MakeItIncreasing{
    public static void solve(long arr[],int n){
        if(n==1){
            System.out.println(0);
            return;
        }
        boolean flag=true;
        int cnt=0;
        if(arr[n-1]==0){
            System.out.println(-1);
            return;
        }
        for(int i=n-2;i>=0;i--){
            while(arr[i]>=arr[i+1]){
                arr[i]=arr[i]/2;
                cnt++;
            }
            if(arr[i]==0 && i!=0){
                flag=false;
                break;
            }
        }

        if(!flag) System.out.println(-1);
        else System.out.println(cnt);
        
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