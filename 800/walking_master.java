import java.util.*;

public class walking_master {
    public static void solve(int x1,int y1,int x2,int y2){
        // (x+1,y+1) (x-1,y)

        if(y2<y1){
            System.out.println(-1);
            return;
        }

        int y_diff=Math.abs(y2-y1);
        if(y_diff+x1<x2){
            System.out.println(-1);
            return;
        }

        int x_diff=Math.abs(x2-x1);
        if(x_diff==0 && y_diff==0){
            System.out.println(0);
            return;
        }

        int nX1=y_diff+x1;
        int ans=y_diff+Math.abs(x2-nX1);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            solve(x1,y1,x2,y2);
            t--;
        }
    }
}
