import java.util.*;
public class ArrayCloningTechnique{
    public static void solve(long arr[],int n){
        HashMap<Long,Integer> map=new HashMap<>();

        for(long it:arr){
            map.put(it,map.getOrDefault(it,0)+1);
        }

        int maxi=0;
        for(long it:map.keySet()){
            maxi=Math.max(maxi,map.get(it));
        }

        int diff=n-maxi;

        while(maxi<n){
            maxi*=2;
            diff++;
        }

        System.out.println(diff);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long arr[]=new long[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

           solve(arr,n);
        }
    }
}