import java.util.*;
public class ThreeIndices {
    public static void solve(int arr[]){
        int n=arr.length;
        int pre[]=new int[n];
        int suff[]=new int[n];

        int mini=arr[0];
        int idx=0;
        pre[0]=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>mini){
               pre[i]=idx;
            }
            else{
                pre[i]=-1;
            }
            if(arr[i]<mini){
                mini=arr[i];
                idx=i;
            }
        }

        mini=arr[n-1];
        idx=n-1;
        suff[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>mini){
               suff[i]=idx;
            }
            else{
                suff[i]=-1;
            }
            if(arr[i]<mini){
                mini=arr[i];
                idx=i;
            }
        }

        for(int i=0;i<n;i++){
            if(pre[i]!=-1 && suff[i]!=-1){
                System.out.println("YES");
                System.out.println((pre[i]+1) +" "+(i+1)+" "+(suff[i]+1));
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            solve(arr);
        }
    }
}