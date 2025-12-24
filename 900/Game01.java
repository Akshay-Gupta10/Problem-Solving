import java.util.*;
public class Game01 {
    public static void solve(String s) {
        int n=s.length();
        Stack<Character> stk=new Stack<>();
         
        boolean alice=false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(stk.isEmpty() || stk.peek()==ch){
                stk.push(ch);
            }
            else{
                stk.pop();
                alice=!alice;
            }
        }

        if(alice) System.out.println("DA");
        else System.out.println("NET");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s=sc.next();
            solve(s);
        }
    }
}