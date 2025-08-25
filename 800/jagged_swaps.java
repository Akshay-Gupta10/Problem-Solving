import java.util.*;
public class jagged_swaps {
    public static void solve(int arr[],int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
        }
        if(arr[0]!=min){
            System.out.println("NO");
            return;
        }
       
        System.out.println("YES");
       
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();

       while(t!=0){
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(arr,n);
        t--;
    }
}   
}
