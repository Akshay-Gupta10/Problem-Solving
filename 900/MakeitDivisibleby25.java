import java.util.*;
public class MakeitDivisibleby25{
    public static void solve(long n){
        String str=String.valueOf(n);

        int len=str.length();

        Set<Character> set=new HashSet<>();
        int cnt=0;
        for(int i=len-1;i>=0;i--){
            char ch=str.charAt(i);
            if((ch=='0' || ch=='5') && set.contains('0')){
                break;
            }
            else if((ch=='2' || ch=='7') && set.contains('5')){
                break;
            }
            else if(ch=='0' && set.contains(ch)==false){
                set.add(ch);
            }
            else if(ch=='5' && set.contains(ch)==false){
                set.add(ch);
            }
            else{
                cnt++;
            }
        }

        System.out.println(cnt+set.size()-1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();

          
           solve(n);
        }
    }
}