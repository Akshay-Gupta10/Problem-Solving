import java.util.*;

public class gridPaths {
    static int mod=(int)1e9+7;
    public static int helper(int i,int j,int n,char arr[][],int dp[][]){
        if(i<0 || j<0) return 0;
        if(arr[i][j]=='*'){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }

        if(dp[i][j]!=-1) return dp[i][j]%mod;
        int up=helper(i-1, j, n, arr,dp)%mod;
        int left=helper(i, j-1, n, arr,dp)%mod;

        return dp[i][j]=(up+left)%mod;
    }
    public static int solve(char arr[][],int n){
        int dp[][]=new int[n][n];
        for(int row[]:dp) Arrays.fill(row,-1);
        return helper(n-1,n-1,n,arr,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            char ch[]=s.toCharArray();
            for(int j=0;j<n;j++){
                arr[i][j]=ch[j];
            }
        }
        System.out.println(solve(arr,n));
        sc.close();
    }
}
