import java.util.*;

public class permutations {
    public static void solve(long n){
        if(n==1){
            System.out.println(1);
            return;
        }
        if(n<=3){
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder sb=new StringBuilder();
        for(long i=2;i<=n;i+=2){
           sb.append(i).append(" ");
        }
        for(long i=1;i<=n;i+=2){
           sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        solve(n);
        sc.close();
    }
}
