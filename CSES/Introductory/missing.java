import java.util.*;

public class missing {
    public static long solve(int arr[],long n){
        long sum=n*(n+1)/2;
        for(int it:arr){
            sum-=it;
        }
        return sum;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int arr[]=new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(solve(arr,(long)n));
            sc.close();
    }
}
