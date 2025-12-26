import java.util.*;
public class not_dividing{
    public static void solve(int n,long arr[]){
        for(int i=0;i<n;i++){
            while(arr[i]==1 || (i>0 && arr[i]%arr[i-1]== 0)){
                arr[i]++;
            } 
            System.out.print(arr[i]+(i==n-1?"\n":" "));
        }
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

            solve(n,arr);
        }
    }
}