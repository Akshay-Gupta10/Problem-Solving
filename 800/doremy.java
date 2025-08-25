import java.util.*;
public class doremy{
    public static void solve(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(map.size()>2){
            System.out.println("No");
            return;
        }

        if(map.size()==1){
            System.out.println("Yes");
        }
        else{
            int first=0;
            for(int it:map.keySet()){
                first=map.get(it);
                map.remove(it);
                break;
            }
            int second=0;
            for(int it:map.keySet()){
                second=map.get(it);
                map.remove(it);
                break;
            }

            if(Math.abs(first-second)>1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        
        while(t!=0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solve(arr, n);
            t--;
        }
    }
}
