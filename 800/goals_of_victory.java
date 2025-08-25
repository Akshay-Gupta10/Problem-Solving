import java.util.*;
public class goals_of_victory {
    public static void solve(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(-sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
    
        while(t!=0){
            int n=sc.nextInt();
            int arr[]=new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            solve(arr);
            t--;
        }
    }
}

