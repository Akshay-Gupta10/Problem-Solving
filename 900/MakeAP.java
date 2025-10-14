import java.util.*;
public class MakeAP{
    public static void solve(int a,int b,int c){
        int val1=(2*b-c)%a;
        int val2=(c+a)%(2*b);
        int val3=(2*b-a)%c;
        int val4=(2*b-c)/a;
        int val5=(c+a)/(2*b);
        int val6=(2*b-a)/c;

        if((val1==0 && val4>0) || (val2==0 && val5>0 )|| (val3==0 && val6>0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            
            solve(a,b,c);
        }
    }
}