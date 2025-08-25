import java.util.*;
public class cover_in_water{
    public static void solve(int n,String s){
        int i=0;
        int cnt=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='#'){
                i++;
            }
            else{
                int counter=0;
                while(i<n && s.charAt(i)=='.'){
                    counter++;
                    i++;
                }
                if(counter==1){
                    cnt+=1;
                }
                else if(counter==2){
                    cnt+=2;
                }
                else{
                    cnt=2;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        
        while(t!=0){
            int n=sc.nextInt();
            String s=sc.next();
            solve(n,s);
            t--;
        }
    }
}
