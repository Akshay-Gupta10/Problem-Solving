import java.util.*;
public class AvtoBus{
    public static void solve(long n){
        if(n%2==1 || n<4){
            System.out.println(-1);
            return;
        }

        long maxi=n/4;
        long mini=n/6;
        if(n%6!=0){
            mini+=1;
        }

        System.out.println(mini+" "+maxi);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();

            solve(n);
        }
    }
}