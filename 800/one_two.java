import java.util.Scanner;
public class one_two {
    public static void solve(int arr[]){
        int n=arr.length;

        long pro=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=1 && arr[i]!=2){
                continue;
            }
            pro*=arr[i];
        }
        
        if(pro%2==1 && pro!=1){
            System.out.println(-1);
            return;
        }
        long val=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=1 && arr[i]!=2){
                continue;
            }
            val*=arr[i];
            long rem=pro/val;

            if(val==rem){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
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
            solve(arr);
            t--;
        }
    }
}
