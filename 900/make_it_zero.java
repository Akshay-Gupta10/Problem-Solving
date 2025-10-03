import java.util.*;
public class make_it_zero{
    public static void solve(int arr[]){
        int n=arr.length;

        if(n%2==0){
            System.out.println(2);
            System.out.println(1+" "+n);
            System.out.println(1+" "+n);
        }
        else{
            if(n==1){
                System.out.println(1);
                System.out.println(1+" "+1);
            }
            else{
                System.out.println(4);
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));
                System.out.println((n-1)+" "+n);
                System.out.println((n-1)+" "+n);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }

            solve(arr);
        }
    }
}