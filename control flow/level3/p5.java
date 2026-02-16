import java.util.*;
public class p5
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,t,sum=0,d;
        n=sc.nextInt();
        t=n;
        while(n!=0)
        {
            d=n%10;
            sum+=Math.pow(d,3);
            n=n/10;
        }
        if (sum==t)
        System.out.println("Armstrong no.");
        else
        System.out.println("not a armstrong no.");

        }
}

