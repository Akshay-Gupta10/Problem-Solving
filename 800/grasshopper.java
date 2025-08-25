import java.util.*;
public class grasshopper {
    public static void solve(int n,int k){
        if(n%k==0){
            System.out.println(2);
            System.out.print(k-1+" ");
            System.out.println(n-(k-1));
        }
        else{
            System.out.println(1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            solve(n,k);
            t--;
        }
    }
}
