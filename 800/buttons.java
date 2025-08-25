import java.util.Scanner;

public class buttons {
    public static void solve(int a,int b,int c){
        int first=a+c;
        int second=b+c;

        if(first>second){
            System.out.println("First");
        }
        else if(first==second){
            if((a+b+c)%2==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
        else{
            System.out.println("Second");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t>0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            solve(a,b,c);
            t--;
        }
    }
}
