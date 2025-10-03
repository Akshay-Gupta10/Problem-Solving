import java.util.Scanner;
public class one_two {
    public static void solve(int arr[]){
        int n=arr.length;

        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==2) cnt++;
        }

        if(cnt%2==1){
            System.out.println(-1);
            return;
        }
        if(cnt==0){
            System.out.println(1);
            return;
        }

        int half=cnt/2;

        for(int i=0;i<n;i++){
            if(arr[i]==2) half--;
            if(half==0){
                System.out.println(i+1);
                return;
            }
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
            solve(arr);
            t--;
        }
    }
}