import java.util.Scanner;
public class extremely_round {
    public static long solve(long n){
        if(n<10){
            return n;
        }
        else if(n<100){
            return 9+(n/10);
        }
        else if(n<1000){
            return 18+(n/100);
        }
        else if(n<10000){
            return 27+(n/1000);
        }
        else if(n<100000){
            return 36+(n/10000);
        }
        else{
            return 45+(n/100000);
        } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextInt();
            
            long ans=solve(n);
            System.out.println(ans);
        }
    }
}