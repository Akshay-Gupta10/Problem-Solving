import java.util.*;
public class LongestDivisorsInterval{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
       
        /* Argument is that if the range [l,r] divides n then there must be some integer that divides [l,r] starting from 1...
        [l,r] max range is equal to max range of 1 to value until cond is matched */
        while(t-->0){
            long n=sc.nextLong();

            int i=1;
            while(n%i==0){
                i++;
            }

            System.out.println(i-1); //count

        }
    }
}