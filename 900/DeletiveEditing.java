import java.util.*;
public class DeletiveEditing{
    public static boolean solve(String s1,String s2){
        HashMap<Character,Queue<Integer>> map=new HashMap<>();

        int n=s1.length();  
        for(int i=n-1;i>=0;i--){
            char ch=s1.charAt(i);
            if(map.containsKey(ch)){
                Queue<Integer> q=map.get(ch);
                q.add(i);
                map.put(ch,q);
            }
            else{
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                map.put(ch,q);
            }
        }

        int m=s2.length();
        int last=n;
        for(int i=m-1;i>=0;i--){
            char ch=s2.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch).size()>0 && map.get(ch).peek()<last){
                    last=map.get(ch).peek();
                    map.get(ch).remove();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();

           System.out.println(solve(s1,s2)?"YES":"NO");
        }
    }
}