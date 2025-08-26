import java.util.*;
public class p1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>0)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print(i);
                if(i%2==0)
                System.out.println( " even");
                else
                System.out.println( " odd");
            }
        }
        else
        System.out.println(" not a natural no");
    }
}