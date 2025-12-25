import java.util.*;
public class SwapandDelete {
    public static void solve(String s) {
        int n=s.length();
        int cnt0=0;
        int cnt1=0;

        for(char ch:s.toCharArray()){
            if(ch=='1') cnt1++;
            else cnt0++;
        }

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') cnt0--;
            else cnt1--;

            if(cnt0<0 || cnt1<0){
                System.out.println(n-i);
                return;
            }
        }
        System.out.println(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s=sc.next();

            solve(s);
        }
    }
}