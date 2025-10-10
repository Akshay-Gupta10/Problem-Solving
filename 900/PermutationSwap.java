import java.util.*;
public class PermutationSwap{
    public static int solve(int a,int b){
        if(b==0) return a;

        return solve(b,a%b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
       
        /* Argument is that find the distance by which each digit is misplaced from its original position and after finding the distances 
        find their gcd to get the greatest k that can fit in*/
        while(t-->0){
            int n=sc.nextInt();

            int arr[]=new int[n];
            int diff[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                diff[i]=Math.abs(arr[i]-(i+1));
            }

            int gcd=0;
            for(int it:diff){
                if(it!=0){
                    gcd=solve(gcd,it);
                }
            }

            System.out.println(gcd);

        }
    }
}