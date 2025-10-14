import java.util.*;
public class OddGrasshopper{
    public static void solve(long x,long n){
        long rem=n%4;
        if(Math.abs(x)%2==0){
            if(rem==0){
                System.out.println(x);
            }
            else if(rem==1){
                System.out.println(x-n);
            }
            else if(rem==2){
                System.out.println(x+1);
            }
            else{
                System.out.println(x+(4*(n+1)/4));
            }
        }
        else{
            if(rem==0){
                System.out.println(x);
            }
            else if(rem==1){
                System.out.println((x+1)+(4*(n/4)));
            }
            else if(rem==2){
                System.out.println(x-1);
            }
            else{
                System.out.println((-4*(n+1)/4)+x);
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            long x=sc.nextLong();
            long n=sc.nextLong();

           solve(x,n);
        }
    }
}