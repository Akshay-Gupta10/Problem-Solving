import java.util.*;
public class ambitious_kid {
    public static void solve(int arr[]){
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                System.out.println(0);
                return;
            }
            int abs=Math.abs(arr[i]);
            min=Math.min(min,abs);
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(arr);
    }
}

