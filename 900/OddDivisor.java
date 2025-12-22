import java.util.*;
public class OddDivisor{
    public static void solve(long n){
        if(n%2==1){
            System.out.println("YES");
        } 
        else{
            while(n%2==0 && n>0){
                n/=2;
            }
            if(n==1){
                System.out.println("NO");
            } 
            else{
                System.out.println("YES");
            }
        }
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