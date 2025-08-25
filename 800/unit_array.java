import java.util.*;

public class unit_array {
    public static void solve(int arr[],int n){
        int cntP=0;
        int cntN=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cntP++;
            }
            else{
                cntN++;
            }
        }
        
        
        int cnt=0;
        while(cntP<cntN || cntN%2==1){
            cntP++;
            cntN--;
            cnt++;
        }
        System.out.println(cnt);
    
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solve(arr,n);
            t--;
        }
    }
}
