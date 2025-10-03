import java.util.Scanner;
import java.util.*;
public class sum{
    public static void solve(int arr[],int x,int n){
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     int rem=x-arr[i];
        //     if(map.containsKey(rem)){
        //         System.out.print((i+1)+" "+(map.get(rem)+1));
        //         return;
        //     }
        //     else{
        //         map.put(arr[i],i);
        //     }
        // }
        // System.out.println("IMPOSSIBLE");
        
        Arrays.sort(arr);
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            int sum=arr[lp]+arr[rp];
            if(sum==x){
                System.out.print((lp+1)+" "+(rp+1));
                return;
            }
            else if(sum>x){
                rp--;
            }
            else{
                lp++;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        solve(arr,x,n);
        sc.close();
    }
}