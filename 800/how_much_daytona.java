import java.util.*;
public class how_much_daytona {
    public static void solve(int n,int k,int arr[]){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
    
        while(t!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solve(n,k,arr);
            t--;
        }
    }
}

