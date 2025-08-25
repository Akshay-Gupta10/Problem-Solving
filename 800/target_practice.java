import java.util.*;
public class target_practice {
    public static void solve(char arr[][]){
        int cnt=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                char ch=arr[i][j];
                if(ch=='X'){
                    if(i==0 || i==9 || j==0 || j==9){
                        cnt+=1;
                    }
                    else if(i==1 || i==8 || j==1 || j==8){
                        cnt+=2;
                    }
                    else if(i==2 || i==7 || j==2 || j==7){
                        cnt+=3;
                    }
                    else if(i==3 || i==6 || j==3 || j==6){
                        cnt+=4;
                    }
                    else{
                        cnt+=5;
                    }
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
            char arr[][]=new char[10][10];
            for(int i=0;i<10;i++){
                String str=sc.next();
                char ch[]=str.toCharArray();
                for(int j=0;j<10;j++){
                    arr[i][j]=ch[j];
                }
            }
            solve(arr);
            t--;
        }
    }
}

