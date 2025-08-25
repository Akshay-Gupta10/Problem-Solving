import java.util.*;

public class united_we_stand {
    public static void solve(int arr[]){
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        if(set.size()==1){
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr);
        int last=arr[n-1];
        int i;
        for(i=n-2;i>=0;i--){
            if(arr[i]!=last){
                break;
            }
        }
        System.out.print(i+1+" "+(n-i-1));
        System.out.println();
        i=0;
        while(arr[i]!=last){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        while(i<n){
            System.out.print(arr[n-1]+" ");
            i++;
        }
        System.out.println();
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
            solve(arr);
            t--;
        }
    }
}
