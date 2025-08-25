import java.util.Scanner;
import java.util.*;
public class we_need_zero {
    public static void solve(int arr[]){
        int n=arr.length;

        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }

        if(xor!=0 && n%2==0){
            System.out.println(-1);
        }
        else{
            System.out.println(xor);
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
