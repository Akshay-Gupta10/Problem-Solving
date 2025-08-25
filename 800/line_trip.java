import java.util.Scanner;

public class line_trip{
    public static void solve(int arr[],int n,int x){
        int max=0;
        for(int i=1;i<n;i++){
            int diff=arr[i]-arr[i-1];
            max=Math.max(max,diff);
        }
        max=Math.max(max,arr[0]-0);
        int dis=Math.abs(arr[n-1]-x);
        max=Math.max(max,2*dis);
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t!=0){
            int n=sc.nextInt();
            int x=sc.nextInt();

            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solve(arr,n,x);
            t--;
        }
    }
}