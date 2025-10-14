import java.util.*;
public class ABBalance{
    public static void solve(String str){
        int n=str.length();

        if(str.charAt(0)!=str.charAt(n-1)){
            str=str.substring(0,n-1);
            str+=str.charAt(0);
        }
        System.out.println(str);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            String str=sc.next();

           solve(str);
        }
    }
}