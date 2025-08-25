import java.util.Scanner;
import java.util.*;
public class blank_space {
    public static void solve(int arr[]){
        int n=arr.length;
        int max=0;
        int cnt=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cnt++;
            }
            else{
                cnt=0;
            }
            max=Math.max(cnt,max);
        }
        System.out.println(max);
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
