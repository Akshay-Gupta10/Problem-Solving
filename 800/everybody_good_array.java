import java.util.Scanner;
public class everybody_good_array {
    public static void solve(int arr[]){
        int n=arr.length;

        int cnt=0;
        for(int i=1;i<n;i++){
            if(arr[i]%2==arr[i-1]%2){
                cnt++;
            }
        }

        System.out.println(cnt);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solve(arr);
        }
    }
}