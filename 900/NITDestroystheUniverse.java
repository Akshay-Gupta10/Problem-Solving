import java.util.*;
public class NITDestroystheUniverse{
    public static void solve(int arr[],int n){
        /* Argument is that the ans is either 0,1 or 2 ...if all zero then zero if only one consecutive block of non zero ele then 1
        else 2 as in this case we will take all the ele and the mex in 1st operation will be some value m and all ele will be m and in 
        sec operation i will be having whole array and its mex will turn out to be 0 */

        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                if(flag==0){
                    flag=1;
                }
                else if(flag==2){
                    flag=3;
                    break;
                }
            }
            else{
                if(flag==1){
                    flag=2;
                }
            }
        }

        if(flag==3) System.out.println(2);
        else System.out.println(1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];

            boolean flag=true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>0) flag=false;
            }

            if(flag) System.out.println(0);
            else {
                solve(arr,n);
            }


        }
    }
}