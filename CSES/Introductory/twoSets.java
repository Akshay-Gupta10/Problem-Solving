import java.util.*;
public class twoSets{
    public static void solve(long n){
        long sum=n*(n+1)/2;

        if(sum%2==1){
            System.out.println("NO");
            return;
        }
        else{
            long half=sum/2;
            
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        solve(n);
    }
}