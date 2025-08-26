import java.util.*;
public class comparison_string{
    public static void solve(int n,String str){
        int cnt=1;
        int maxi=0;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }
            else{
                maxi=Math.max(maxi,cnt);
                cnt=1;
            }
        }
        maxi=Math.max(maxi,cnt);
        System.out.println(maxi+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();

            String str=sc.next();

            solve(n,str);
        }
    }
}