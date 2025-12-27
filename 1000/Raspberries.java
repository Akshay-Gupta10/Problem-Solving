import java.util.*;
public class Raspberries {
    public static void solve(int n,int k,int a[]){
        int ans=5,even=0;

        for(int i=0;i<n;i++){
            ans=Math.min(ans,((k-(a[i]%k))%k));
            if(a[i]%2==0) even++;
        }

        if(k==4){
            if(even>=2) ans=0;
            else if(even==1) ans=Math.min(1,ans);
            else ans=Math.min(ans,2);     

        }

        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
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