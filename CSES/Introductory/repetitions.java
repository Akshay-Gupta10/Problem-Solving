import java.util.*;

public class repetitions {
    public static int solve(String s){
        int n=s.length();
        int cnt=1;
        int max=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
            else{
                cnt=1;
            }
            max=Math.max(cnt, max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.println(solve(s));
        sc.close();
    }
}
