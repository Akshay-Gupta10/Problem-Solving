import java.util.*;

public class mocha_and_sevral {
    public static int gcd(int a,int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public static void solve(int arr[],int n){
        int hcf=1;
        int max=0;
        for(int i=0;i<n-1;i++){
            int temp=gcd(arr[i],arr[i+1]);
            if(temp>hcf){
                hcf=temp;
            }
            max=Math.max(max,hcf);
        }

        if(hcf>n || hcf>max){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
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
