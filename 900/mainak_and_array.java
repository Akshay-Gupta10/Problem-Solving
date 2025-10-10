import java.util.*;
public class mainak_and_array{
    public static void solve(int a[],int n){
        //if the first ele is kept intact then the diff will be the all rem ele - a[0]
        int maxi=0;
        for(int i=1;i<n;i++){
            int diff=a[i]-a[0];
            maxi=Math.max(maxi,diff);
        }

        //if the last ele is kept intact then the diff will be the a[n-1] - all rem ele 
        for(int i=0;i<n-1;i++){
            int diff=a[n-1]-a[i];
            maxi=Math.max(maxi,diff);
        }

        //if both are hampered then the diff will be ai-ai+1 
        for(int i=0;i<n-1;i++){
            int diff=a[i]-a[i+1];
            maxi=Math.max(maxi,diff);
        }

        maxi=Math.max(maxi,a[n-1]-a[0]);
        System.out.println(maxi);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

           solve(arr,n);
        }
    }
}