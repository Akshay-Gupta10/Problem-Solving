import java.util.Scanner;
public class two_perm {
    public static void solve(long n,long a,long b){
        if(n==a && n==b){
            System.out.println("YES");
            return;
        }
            

        long diff=n-2;
        if(a+b<=diff){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextInt();
            long a=sc.nextInt();
            long b=sc.nextInt();

            
            solve(n,a,b);
        }
    }
}