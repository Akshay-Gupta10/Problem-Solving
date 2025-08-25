import java.util.*;

public class forbidden {
    public static void solve(int n,int k,int x){
        if(k==1){
            System.out.println("NO"); return;
        }
        if(x!=1 && k!=1){
            System.out.println("YES");
            System.out.println(n);
            for(int i=0;i<n;i++){
                System.out.print("1 ");
            }
            System.out.println();
            return;
        }
        if(k!=1 && n%2==0){
            System.out.println("YES");
            System.out.println(n/2);
            for(int i=0;i<n/2;i++){
                System.out.print("2 ");
            }
            System.out.println();
            return;
        }

        if(k==2 && n%2==1){
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        int two=(n-2)/2;
        System.out.println(two+1);
        for(int i=0;i<two;i++){
            System.out.print("2 ");
        }
        System.out.print("3");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        
        while(t!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();

            solve(n,k,x);
            t--;
        }
    }
}
