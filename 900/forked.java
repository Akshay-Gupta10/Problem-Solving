import java.util.*;
public class forked{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        //quadrants
        int dr[]={-1,1,-1,1};
        int dc[]={-1,1,1,-1};
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();

            int xk=sc.nextInt();
            int yk=sc.nextInt();

            int xq=sc.nextInt();
            int yq=sc.nextInt();


            //instead of finding every place try to find the places to which one can reach from the king and queen and find the common points

            HashSet<String> kset=new HashSet<>();
            HashSet<String> qset=new HashSet<>();

            for(int i=0;i<4;i++){
                String px=(xk+a*dr[i])+"#"+(yk+b*dc[i]); //a in x and b in y for king
                String py=(xk+b*dr[i])+"#"+(yk+a*dc[i]); //b in x and a in y for king

                kset.add(px);
                kset.add(py);

                String qx=(xq+a*dr[i])+"#"+(yq+b*dc[i]); //a in x and b in y for queen
                String qy=(xq+b*dr[i])+"#"+(yq+a*dc[i]); //b in x and a in y for queen

                qset.add(qx);
                qset.add(qy);
            }

            int cnt=0;
            for(String p:kset){
                if(qset.contains(p)){
                    cnt++;
                }
            }

            System.out.println(cnt);

        }
    }
}