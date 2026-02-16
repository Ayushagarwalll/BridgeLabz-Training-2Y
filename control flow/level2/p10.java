import java.util.*;
public class p10
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,p,c=0,r=1;
        n=sc.nextInt();
        p=sc.nextInt();
        while(c!=p){
            r=r*n;
            c++;
        }
        System.out.println(r);
    }
}