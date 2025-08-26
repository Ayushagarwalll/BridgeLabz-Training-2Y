import java.util.*;
public class p4
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        boolean b=true;
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            b=false;

        }
        System.out.println(b);
    }}