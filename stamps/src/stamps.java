import java.util.*;
class stamps {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] C=new int[n+1];
        int sum=0;
        for(int i=1;i<=n;i++){
            C[i]=s.nextInt();
            sum+=C[i];
        }
        int f=0;
        for(int i=1;i<=n;i++){
            f+=i;
        }
        if(f==sum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
