import java.util.*;
public class dont_count{
    public static void solve(String x,String s){
        int cnt=0;
        while(x.contains(s)==false){
            x=x+x;
            cnt++;
            if(cnt>5) break;
        }
        cnt=cnt>5?-1:cnt;
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        
        while(t!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();

            solve(x,s);
            t--;
        }
    }
}


