import java.util.Scanner;
import java.util.*;
public class prepend_append {
    public static void solve(String str){
        int n=str.length();
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            if(str.charAt(lp)==str.charAt(rp)){
                break;
            }
            lp++;
            rp--;
        }

        System.out.println(rp-lp+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            String str=sc.next();
            solve(str);
            t--;
        }
    }
}
