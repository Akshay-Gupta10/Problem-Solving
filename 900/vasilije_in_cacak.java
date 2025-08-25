import java.util.*;
public class vasilije_in_cacak{
    public static void solve(long n,long k,long x){
        long maxi=n*(n+1)/2;
        long mini=k*(k+1)/2;

        long diff=n-k;
        long temp=diff*(diff+1)/2;

        long mid=maxi-temp;
        if(mid<x){
            System.out.println("NO");
            return;
        }

        if(mini<=x && x<=maxi){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();

            solve(n,k,x);
        }
    }
}